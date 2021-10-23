class FastSolution {
    public int maxProduct(int[] nums) {
        int res = nums[0];
        int currMin = 1, currMax = 1;
        for (int i = 0; i < nums.length; i++) {
            int tmp = currMax * nums[i];
            currMax = max(nums[i] * currMax, nums[i] * currMin, nums[i]);
            currMin = min(tmp, nums[i] * currMin, nums[i]);
            res = Math.max(res, currMax);
        }
        return res;
    }
    private static int max(int n1, int n2, int n3) {
        int tmp = Math.max(n1, n2);
        return Math.max(tmp, n3);
    }

    private static int min(int n1, int n2, int n3) {
        int tmp = Math.min(n1, n2);
        return Math.min(tmp, n3);
    }
}
