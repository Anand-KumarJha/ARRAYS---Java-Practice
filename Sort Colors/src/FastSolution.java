public class FastSolution {
    public void sortColors(int[] nums) {
        int start = 0,mid = 0,end = nums.length - 1;

        while (mid <= end){
            if(nums[mid] == 0){
                swap(nums,start,mid);
                start++;
                mid++;
            }else if(nums[mid] == 1){
                mid++;
            }else{
                swap(nums,mid,end);
                end--;
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
    public int[] swap(int[] nums,int i,int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
        return nums;
    }
}
