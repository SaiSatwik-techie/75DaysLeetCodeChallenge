class Solution {
    public int maximumDifference(int[] nums) {
        int low = nums[0];
        int max = -1;
        for(int i=1;i<nums.length;i++){
            if(nums[i]>low)
            max = Math.max(max,nums[i]-low);
            else{
                low = nums[i];
            }
        }
        return max;
    }
}