class Solution {
    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] merge = new int[nums1.length + nums2.length];
        System.arraycopy(nums1, 0, merge, 0, nums1.length);
        System.arraycopy(nums2, 0, merge, nums1.length, nums2.length);

        Arrays.sort(merge);

        int mid = merge.length / 2;
        if (merge.length % 2 == 0) {
            return (merge[mid - 1] + merge[mid]) / 2.0;
        } else {
            return merge[mid];
        }
}
}