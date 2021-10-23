class Solution {
    public int rob(int[] nums) {
        if(nums.length == 1)return nums[0];
        return Math.max(rob(nums,0,nums.length-1), rob(nums,1,nums.length));
    }

    public int rob(int[] nums, int start, int end){
        int a = 0,b = 0,max = 0;

        for(int i = start; i < end; i++){
            max = Math.max(nums[i] + b, a);
            b = a;
            a = max;
        }
        return max;
    }
}