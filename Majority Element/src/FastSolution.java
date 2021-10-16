class FastSolution {
    public int majorityElement(int[] nums) {
        int count = 0,majority = -1;
        for(int i = 0; i < nums.length; i++){
            if(count == 0){
                majority = nums[i];
            }
            if(nums[i] == majority){
                count++;
            }else{
                count--;
            }

        }return majority;
    }
}