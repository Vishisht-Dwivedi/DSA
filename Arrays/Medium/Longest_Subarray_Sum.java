package Arrays.Medium;
import java.util.*;
public class Longest_Subarray_Sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of elements");
        int n = sc.nextInt();
        System.out.println("Enter the elements");
        int[] nums = new int[n];
        for(int i=0;i<n;i++){
            nums[i] = sc.nextInt();
        }
        System.out.println("Enter k");
        int k = sc.nextInt();
        int res = longestSubarray(nums,k);
        System.out.printf("Res: %d",res);
        sc.close();
    }   
    public static int longestSubarray(int[] nums, int k) {
        int currSum = 0;
        int maxLen = 0;
        HashMap<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            currSum += nums[i];
            if (currSum == k) {
                maxLen = i + 1;
            }
            if (map.containsKey(currSum - k)) {
                int prevIndex = map.get(currSum - k);
                maxLen = Math.max(maxLen, i - prevIndex);
            }
            map.putIfAbsent(currSum, i);
        }
        return maxLen;
    }
}
