package Vishisht.Basics.hashing;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

public class Return_Max_Frequency_After_K_Steps {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.printf("Enter the size of array: ");
        int size = sc.nextInt();
        System.out.printf("Enter k: ");
        int k = sc.nextInt();
        int[] array = generateArray(size,sc);
        TreeMap<Integer,Integer> frequencyMap = getFrequencyMap(array);
        ArrayList<Integer> maxFrequencyElements = maxFrequencyElements(frequencyMap);
        int res = maxFrequencyAfterKAdditions(unbox(maxFrequencyElements.toArray(new Integer[0])), frequencyMap, k);
        System.out.println("Max frequency after at most K additions: " + res);
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
    //using tree map to maintain sorted order
    public static TreeMap<Integer, Integer> getFrequencyMap(int[] array) {
        TreeMap<Integer,Integer> frequencyMap = new TreeMap<>();
        for (int i : array) {
            int setValue = frequencyMap.getOrDefault(i, 0);
            frequencyMap.put(i, ++setValue);
        }
        return frequencyMap;
    }
    //getting all the elements with highest frequency since theres higher possibility of them being max possible or converted into max possible
    public static ArrayList<Integer> maxFrequencyElements(TreeMap<Integer,Integer> map){
        ArrayList<Integer> list = new ArrayList<>();
        Set<Integer> keySet =  map.keySet();
        int maxFreq = 0;
        int maxElement = 0;
        for(int element: keySet) {
            if(map.get(element)>maxFreq) {
                maxElement=element;
                maxFreq = map.get(element);
            }
        }
        list.add(maxElement);
        for(int element: keySet) {
            if(element!=maxElement&&map.get(element)==maxFreq){
                list.add(element);
            }
        }
        return list; 
    }
    //using two pointers.. one above max freq element.. one below.. above for trying to shift current to next and below for shifting below to current
    public static int maxFrequencyAfterKAdditions(int[] maxElements, TreeMap<Integer,Integer> freqMap, int k){
        int maxPossibleFreq = 0;

        for (int target : maxElements) {
            int remainingK = k;
            int currentFreq = freqMap.get(target);
            ArrayList<Integer> lower = new ArrayList<>(freqMap.headMap(target, false).descendingKeySet());
            for (int i : lower) {
                int diff = target - i;
                int count = freqMap.get(i);
                int totalCost = diff * count;

                if (totalCost <= remainingK) {
                    currentFreq += count;
                    remainingK -= totalCost;
                } else {
                    // Can only convert some of them
                    int canConvert = remainingK / diff;
                    currentFreq += canConvert;
                    remainingK = 0;
                    break;
                }
            }
            maxPossibleFreq = Math.max(maxPossibleFreq, currentFreq);
        }

        return maxPossibleFreq;
    }

    // Helper method to convert Integer[] to int[]
    public static int[] unbox(Integer[] boxed) {
        int[] arr = new int[boxed.length];
        for (int i = 0; i < boxed.length; i++) {
            arr[i] = boxed[i];
        }
        return arr;
    }
}
