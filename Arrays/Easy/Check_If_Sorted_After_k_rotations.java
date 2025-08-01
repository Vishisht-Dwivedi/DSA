package Arrays.Easy;

public class Check_If_Sorted_After_k_rotations {
    public boolean check(int[] nums) {
        int sortedUpto = -1;
        boolean sortedCompletely = true;
        for(int i=1; i<nums.length; i++){
            if(nums[i]<nums[i-1]&&sortedUpto==-1){
                sortedUpto = i;
            } else if(nums[i]<nums[i-1]&&sortedUpto!=-1){
                sortedCompletely = false;
                return sortedCompletely;
            }
        }
        if(sortedUpto>=0){
            if(nums[0]<nums[nums.length-1]){
                sortedCompletely = false;
                return sortedCompletely;
            }
        }
        return sortedCompletely;
    }
}

