class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        int count=0, multiple = 1;
        for(int i = 0; i < nums.length; i++){
            multiple = 1;
            for(int j = i; j < nums.length; j++){
                multiple *= nums[j];
                if(multiple < k){
                    count++;
                }else{
                    multiple = 1;
                    break;
                }
            }
        }return count;
    }
}