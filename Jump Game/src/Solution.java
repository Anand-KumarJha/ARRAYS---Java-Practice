class Solution {
    public boolean canJump(int[] nums) {

        int reach = 0,i;
        for(i=0; i< nums.length; i++){
            reach = Math.max(reach, nums[i]);
            if(reach == 0)break;
            reach--;
        }
        return i == nums.length-1 || i == nums.length;
    }
}