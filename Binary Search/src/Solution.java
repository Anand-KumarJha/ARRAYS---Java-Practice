class Solution {
    public int search(int[] nums, int target) {
        int j = nums.length,i = 0,mid;

        while(i < j){
            mid = (i + j)/2;
            if(nums[mid] == target){
                return mid;
            }else if(nums[mid] > target){
                j = mid;
            }else{
                i = mid + 1;
            }
        }return -1;
    }
}