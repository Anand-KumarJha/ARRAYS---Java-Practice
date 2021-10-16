class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] answers = new int[nums.length];
        int answer = 1,answer0 = 1;
        boolean zero = false;

        for (int num : nums) {
            if (zero) {
                answer0 = answer0 * num;
            }
            if (num == 0) {
                answer0 = answer;
                zero = true;
            }
            answer = answer * num;

        }
        for(int i = 0; i < nums.length; i++){
            if(nums[i] == 0){
                answers[i] = answer0;
            }else{
                answers[i] = answer/nums[i];
            }

        }
        return answers;
    }
}