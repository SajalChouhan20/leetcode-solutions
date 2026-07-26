class Solution {
    public int lengthOfLIS(int[] nums) {
        int n=nums.length;
        int[] dp=new int[n];
        dp[0]=nums[0];
        int count=1;
        for(int i=1;i<n;i++){
            if(nums[i]>dp[count-1]){
                dp[count]=nums[i];
                count++;
            }else{
                for(int j=0;j<count;j++){
                    if(nums[i]>dp[j]){
                        continue;
                    }else{
                        dp[j]=nums[i];
                        break;
                    }
                }
            }
        }
        return count;
    }
}