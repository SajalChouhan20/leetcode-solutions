class Solution {
    public int wiggleMaxLength(int[] nums) {

        if (nums.length == 1)
            return 1;

        int prevDiff = 0;
        int count = 1;

        for (int i = 1; i < nums.length; i++) {

            int currDiff = nums[i] - nums[i - 1];

            if ((currDiff > 0 && prevDiff <= 0) ||
                (currDiff < 0 && prevDiff >= 0)) {

                count++;
                prevDiff = currDiff;
            }
        }

        return count;
    }
}