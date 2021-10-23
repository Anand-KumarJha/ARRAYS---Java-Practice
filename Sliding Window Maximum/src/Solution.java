class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int[] maxArr = new int[nums.length-(k-1)];
        int maxNumber;

        for(int i = 0; i <= nums.length - k; i++){
            maxNumber = Integer.MIN_VALUE;
            for(int j = i; j < i + k; j++){
                maxNumber = Math.max(maxNumber,nums[j]);
            }
            maxArr[i] = maxNumber;
        }return maxArr;
    }
}