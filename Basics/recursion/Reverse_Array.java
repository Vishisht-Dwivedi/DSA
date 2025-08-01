import java.util.ArrayList;
import java.util.Scanner;

public class Reverse_Array {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of elements: ");
        int size = sc.nextInt();
        ArrayList<Integer> arr = getInput(size, sc);
        sc.close();
        reverse_array(0, arr, size);
        System.out.printf("After reversing : ");
        for(int n: arr){
            System.out.printf("%d ",n);
        }
    }

    public static ArrayList<Integer> getInput(int n, Scanner sc) {
        ArrayList<Integer> arr = new ArrayList<>();
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            int input = sc.nextInt();
            arr.add(input);
        }
        return arr;
    }
    public static void reverse_array(int i,ArrayList<Integer> arr,int n) {
        if(i>=n/2) {
            return;
        }
        int temp = arr.get(i);
        arr.set(i,arr.get(n-i-1));
        arr.set(n-i-1,temp);
        reverse_array(i+1, arr, n);
    }
}
