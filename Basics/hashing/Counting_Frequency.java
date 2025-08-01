package Basics.hashing;

import java.util.HashMap;
import java.util.Scanner;

public class Counting_Frequency {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.printf("Enter the size of array: ");
        int size = sc.nextInt();
        int[] array = generateArray(size,sc);
        HashMap<Integer,Integer> frequencyMap = getFrequencyMap(array);
        System.out.println(frequencyMap.entrySet());
        sc.close();
    }
    public static int[] generateArray(int size,Scanner sc){
        int[] array = new int[size];
        for(int i=0;i<size;i++){
            int input = sc.nextInt();
            array[i]=input;
        }
        return array;
    }
    public static HashMap<Integer, Integer> getFrequencyMap(int[] array) {
        HashMap<Integer, Integer> frequencyMap = new HashMap<>();
        for (int i : array) {
            int setValue = frequencyMap.getOrDefault(i, 0);
            frequencyMap.put(i, ++setValue);
        }
        return frequencyMap;
    }
}
