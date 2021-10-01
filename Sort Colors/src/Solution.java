class Solution {
    public void sortColors(int[] nums) {
        int temp;
        boolean complete = false;

        while (!complete) {
            complete = true;
            for (int i = 0; i < nums.length; i++) {

                if (i < nums.length - 1 && nums[i] > nums[i + 1]) {
                    complete = false;
                    temp = nums[i];
                    nums[i] = nums[i + 1];
                    nums[i + 1] = temp;
                }

            }
        }

        System.out.print("[");
        for(int i = 0; i < nums.length; i++){
            if(i < nums.length - 1) {
                System.out.print(nums[i] + ",");
            }else{
                System.out.print(nums[i]);
            }
        }
        System.out.print("]");


    }
}