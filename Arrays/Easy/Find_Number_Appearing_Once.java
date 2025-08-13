package Arrays.Easy;

public class Find_Number_Appearing_Once {
    public int singleNumber(int[] nums) {
        int xor = nums[0];
        for(int i=1;i<nums.length;i++){
            xor = xor^nums[i];
        }
        return xor;
    }
}
