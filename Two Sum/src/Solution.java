class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] arr = new int[2];

        for(int i = 0, j; i < nums.length; i++){
            j = 0;
            while(j < nums.length){
                if(i != j){
                    if(nums[i] + nums[j] == target){
                        arr[0] = i;
                        arr[1] = j;
                    }
                }
                j++;
            }
        }return arr;
    }
}