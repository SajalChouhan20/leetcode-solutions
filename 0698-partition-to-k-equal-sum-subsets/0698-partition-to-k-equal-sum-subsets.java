// class Solution {
//     public boolean canPartitionKSubsets(int[] nums, int k) {
//          int target=0;
//         for(int num:nums) target+=num;
//         if(target%k!=0) return false;
//         int target1=target/k;
//         boolean[] dp=new boolean[target1+1];
//         dp[0]=true;
//         for(int num:nums){
//                 for(int j=target1;j>=num;j--){
//                     if(dp[j-num]) dp[j]=true;
//                     if(dp[target1]) return true;
//         }
//         }
//         return dp[target1];
//     }
// }
class Solution {
    public boolean canPartitionKSubsets(int[] nums, int k) {
        int target = 0;
        for (int num : nums) target += num;
        if (target % k != 0) return false;
        
        int target1 = target / k;
        boolean[] visited = new boolean[nums.length];
        
        return backtrack(nums, visited, 0, k, 0, target1);
    }

    private boolean backtrack(int[] nums, boolean[] visited, int startIndex, int k, int currentSum, int target) {
        if (k == 1) return true;
        
        if (currentSum == target) {
            return backtrack(nums, visited, 0, k - 1, 0, target);
        }

        for (int i = startIndex; i < nums.length; i++) {
            if (visited[i] || currentSum + nums[i] > target) continue;

            visited[i] = true;
            if (backtrack(nums, visited, i + 1, k, currentSum + nums[i], target)) {
                return true;
            }
            visited[i] = false;
        }

        return false;
    }
}