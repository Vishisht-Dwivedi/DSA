import java.util.Scanner;

public class Insertion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("Enter size of array: ");
        int size = sc.nextInt();
        int[] array = new int[size];
        System.out.println("Enter elements of the array");
        for(int i=0;i<size;i++){
            array[i] = sc.nextInt();
        }
        int[] newArray = Insertion_Sort(array);
        for (int i = 0; i < newArray.length; i++) {
            System.out.printf("%d ",newArray[i]);
        }
        sc.close();
    }
    public static int[] Insertion_Sort(int[] array){
        int size = array.length;
        for (int i = 0; i < size; i++) {
            int j=i;
            while(j>0 && array[j-1] > array[j]){
                int temp = array[j];
                array[j] = array[j-1];
                array[j-1] = temp;
                j--;
            }
        }
        return array;
    }
}
