import java.util.Arrays;

class Solution {
    public void rotate(int[] nums, int k) {

        for(int i = 0; i < k; i++){

            int temp1 = 0,temp2;
            for(int j = 0; j < nums.length; j++){

                if(j == 0){
                    temp1 = nums[j];
                    nums[j] = nums[nums.length-1];
                }else{
                    temp2 = nums[j];
                    nums[j] = temp1;
                    temp1 = temp2;
                }
            }
        }

        System.out.println(Arrays.toString(nums));
    }

}