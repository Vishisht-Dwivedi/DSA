import java.util.ArrayList;
import java.util.Scanner;

public class Merge {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("Enter size of array: ");
        int size = sc.nextInt();
        int[] array = new int[size];
        System.out.println("Enter elements of the array");
        for(int i=0;i<size;i++){
            array[i] = sc.nextInt();
        }
        Merge_Sort(array, 0, size-1);
        for(int i=0;i<size;i++){
            System.out.printf("%d ",array[i]);
        }
        sc.close();
    }
    public static void Merge_Sort(int[] array,int low, int high){
        int mid = (low+high)/2;
        if(low==high){
            return;
        } 
        Merge_Sort(array, low, mid);
        Merge_Sort(array, mid+1, high);
        merge(array,low,mid,high);
    }
    public static void merge(int[] array, int low, int mid, int high) {
        int left = low;
        int right = mid+1;
        ArrayList<Integer> temp = new ArrayList<>();
        while(left <= mid && right <= high){
            if(array[left]<=array[right]){
                temp.add(array[left]);
                left++;
            } else {
                temp.add(array[right]);
                right++;
            }
        }
        while(left<=mid){
            temp.add(array[left]);
            left++;
        }
        while(right<=high){
            temp.add(array[right]);
            right++;
        }
        for(int i=low;i<=high;i++){
            array[i] = temp.get(i-low);
        }
    }
}
