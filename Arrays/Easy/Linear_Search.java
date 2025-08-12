package Arrays.Easy;

public class Linear_Search {
    public void search(int[] nums,int e){
        for(int i=0;i<nums.length;i++){
            if(nums[i]==e){
                System.err.printf("Found at index %d",i);
                break;
            }
        }
    }
}   
