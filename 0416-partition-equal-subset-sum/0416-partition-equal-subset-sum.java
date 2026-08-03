class Solution {
    public boolean canPartition(int[] nums) {
        int target=0;
        for(int num:nums) target+=num;
        if(target%2!=0) return false;
        int target1=target/2;
        boolean[] dp=new boolean[target1+1];
        dp[0]=true;
        for(int num:nums){
                for(int j=target1;j>=num;j--){
                    if(dp[j-num]) dp[j]=true;
                    if(dp[target1]) return true;
        }
        }
        return dp[target1];
    }
}