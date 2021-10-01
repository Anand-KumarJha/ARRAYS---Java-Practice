class Solution {
    public int removeDuplicates(int[] nums) {
        int count = 0;
        for(int i = 2; i < nums.length - count; i++){
            if(count > 0){
                nums[i] = nums[i + count];
            }
            if(nums[i] == nums[i - 1] && nums[i] == nums[i - 2]){
                count++;
                i--;
            }


//            for (int num : nums) {
//                System.out.print(num + ", ");
//            }
//            System.out.println("count = " + count);
        }



        return nums.length - count;
    }
}