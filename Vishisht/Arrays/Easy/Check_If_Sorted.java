package Vishisht.Arrays.Easy;

import java.util.Scanner;

public class Check_If_Sorted {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("Enter size of array: ");
        int size = sc.nextInt();
        int[] array = new int[size];
        System.out.println("Enter elements of the array");
        for(int i=0;i<size;i++){
            array[i] = sc.nextInt();
        }
        boolean isSorted = Check_sorted(array);
        System.out.printf("Sorted: "+isSorted);
        sc.close();
    }
    public static boolean Check_sorted(int[] array) {
        for(int i=1;i<array.length;i++){
            if(array[i]<array[i-1]) return false;
        }
        return true;
    }
}
