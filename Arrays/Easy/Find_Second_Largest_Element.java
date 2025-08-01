package Arrays.Easy;
import java.util.Scanner;

public class Find_Second_Largest_Element {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("Enter size of array: ");
        int size = sc.nextInt();
        int[] array = new int[size];
        System.out.println("Enter elements of the array");
        for(int i=0;i<size;i++){
            array[i] = sc.nextInt();
        }
        int max = find_second_largest(array);
        System.out.printf("Second largest element: %d",max);
        sc.close();
    }
    public static int find_second_largest(int[] array){
        int max = array[0];
        int secondLargest = 0;
        int j=0;
        while(j<array.length){
            if(array[j]<max) {
                secondLargest=array[j];
                break;
            }
            j++;
        }
        for(int i=0;i<array.length;i++){
            if(array[i]>max){
                secondLargest = max;
                max=array[i];
            }
        }
        return secondLargest;
    }
}

