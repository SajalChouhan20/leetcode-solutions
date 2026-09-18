class Solution {
    public int minSumOfLengths(int[] arr, int target) {
       int[] dp=new int[arr.length];
       int left=0;
       int right=0;
       int  min_sum=Integer.MAX_VALUE;
       int min_length=Integer.MAX_VALUE;
       int curr=0;
       int len=0;
       while(right<arr.length){
        curr+=arr[right];
        while(curr>target && left<=right){
            curr-=arr[left++];
        }
        if(curr==target){
            len=right-left+1;
            if(left>0 && dp[left-1]!=Integer.MAX_VALUE){
                min_sum=Math.min(min_sum,len+dp[left-1]);
            }
            min_length=Math.min(min_length,len);
        }
        dp[right]=min_length;
        right++;
       }
       return min_sum == Integer.MAX_VALUE ? -1 : min_sum;
    }
}