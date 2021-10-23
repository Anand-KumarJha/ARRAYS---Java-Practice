class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n = nums1.length + nums2.length;
        boolean even = n % 2 == 0;

        int[] arr = new int[n];
        int k = 0, l = 0;
        for (int i = 0; i < n; i++) {
            if (k < nums1.length && (l >= nums2.length || nums1[k] < nums2[l])) {
                arr[i] = nums1[k];
                k++;
            }else if (l < nums2.length && (k >= nums1.length || nums1[k] > nums2[l])) {
                arr[i] = nums2[l];
                l++;
            }else if(k < nums1.length){
                arr[i] = nums1[k];
                k++;
            }

            if (even && i == (n / 2)) {
                return (double) (arr[i - 1] + arr[i]) / 2;
            } else if (!even && i == (n / 2)) {
                return arr[i];
            }
        }

        return 0.0;
    }
}