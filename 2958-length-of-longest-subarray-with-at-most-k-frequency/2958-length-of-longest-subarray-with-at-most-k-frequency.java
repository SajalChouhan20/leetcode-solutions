class Solution {
    public int maxSubarrayLength(int[] nums, int k) {
        Map<Integer, Integer> temp = new HashMap<>();
        int left = 0;
        int maxLength = 0;

        for (int right = 0; right < nums.length; right++) {
            temp.put(nums[right], temp.getOrDefault(nums[right], 0) + 1);

            while (temp.get(nums[right]) > k) {
                temp.put(nums[left], temp.get(nums[left]) - 1);
                left++;
            }

            maxLength = Math.max(maxLength, right - left + 1);
        }

        return maxLength;
    }
}