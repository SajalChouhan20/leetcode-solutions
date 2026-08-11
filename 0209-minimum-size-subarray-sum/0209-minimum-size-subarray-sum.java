class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int min_len=Integer.MAX_VALUE;
        int l=0;
        int sum=0;
        for(int r=0;r<nums.length;r++){
            sum+=nums[r];
            while(sum>=target){
                if(r-l+1<=min_len){
                    min_len=r-l+1;
                }
                sum-=nums[l];
                l++;
            }
        }
        return min_len!=Integer.MAX_VALUE ? min_len:0;
    }
}