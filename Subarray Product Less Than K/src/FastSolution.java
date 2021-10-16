class FastSolution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        int count=0, multiple = 1;

        for(int i = 0,j = 0; i < nums.length; i++){
            multiple *= nums[i];
            while(multiple >= k){
                if(j == nums.length){
                    return 0;
                }
                multiple /= nums[j++];
            }
            count += (i-j) + 1;

        }return count;
    }
}