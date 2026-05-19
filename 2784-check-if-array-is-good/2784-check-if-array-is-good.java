class Solution {
    public boolean isGood(int[] nums) {
        // Arrays.sort(nums);
        // int n=nums[nums.length-1];
        // if(nums.length==n+1){
        //     return true;
        // }
        // return false;
        int n = nums.length - 1;
        Set<Integer> seen = new HashSet<>();
        boolean dup = false;

        for (int num : nums) {
            if (num > n) return false;

            if (seen.contains(num)) {
                if (num < n || dup) return false;
                dup = true;
                continue;
            }

            seen.add(num);
        }

        return true;
    }
}