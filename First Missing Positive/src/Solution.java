class Solution {
    public int firstMissingPositive(int[] nums) {

        for(int i = 0; i < nums.length;){
            int index = nums[i] - 1,temp;
            if(nums[i] > nums.length || nums[i] <= 0){
                i++;
            }else if(nums[nums[i] - 1] == nums[i]){
                i++;
            }
            else{
                temp = nums[index];
                nums[index] = nums[i];
                nums[i] = temp;
            }
        }

        for(int i = 0; i < nums.length; i++){
            if(nums[i] != i + 1){
                return i+1;
            }
        }return nums[nums.length - 1] + 1;
    }
}           