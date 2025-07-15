class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] v = new int[nums1.length + nums2.length];
    System.arraycopy(nums1, 0, v, 0, nums1.length);
    System.arraycopy(nums2, 0, v, nums1.length, nums2.length);
    Arrays.sort(v);
    int sz = v.length;
    if (sz % 2 == 1) {
        return v[sz / 2];
    } else {
        return (v[sz / 2] + v[(sz / 2) - 1]) / 2.0;
    }
    }
}
