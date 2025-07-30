import java.util.Scanner;

public class Selection {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("Enter size of array: ");
        int size = sc.nextInt();
        int[] array = new int[size];
        System.out.println("Enter elements of the array");
        for(int i=0;i<size;i++){
            array[i] = sc.nextInt();
        }
        int[] newArray = Selection_Sort(array);
        for (int i = 0; i < newArray.length; i++) {
            System.out.printf("%d ",newArray[i]);
        }
        sc.close();
    }
    public static int[] Selection_Sort(int[] array) {
        int size = array.length;
        for(int i=0;i<size-1;i++){
            int min=array[i];
            for(int j=i;j<size-1;j++){
                if(array[j]<min){
                    min=array[j];
                    array[j]=array[i];
                    array[i]=min;
                }
            }
        }
        return array;
    }
}
