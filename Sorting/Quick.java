import java.util.Scanner;

public class Quick {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("Enter size of array: ");
        int size = sc.nextInt();
        int[] array = new int[size];
        System.out.println("Enter elements of the array");
        for(int i=0;i<size;i++){
            array[i] = sc.nextInt();
        }
        Quick_Sort(array, 0, size-1);
        for(int i=0;i<size;i++){
            System.out.printf("%d ",array[i]);
        }
        sc.close();
    }
    public static void Quick_Sort(int[] array, int low, int high) {
        if (low >= high) return;
        
        int i = low;
        int j = high;
        int pivot = array[low];
        
        while (i <= j) {
            while (i <= j && array[i] < pivot) {
                i++;
            }
            while (i <= j && array[j] > pivot) {
                j--;
            }
            if (i <= j) {
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
                i++;
                j--;
            }
        }
        Quick_Sort(array, low, j);
        Quick_Sort(array, i, high);
    }

}
