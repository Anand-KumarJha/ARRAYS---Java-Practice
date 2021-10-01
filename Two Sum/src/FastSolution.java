import java.util.HashMap;

class FastSolution {
    public static int[] twoSum(int[] nums, int target) {
        int[] arr = new int[2];
        HashMap<Integer,Integer> hashmap = new HashMap<>();

        for(int i = 0; i < nums.length; i++){

            if(hashmap.containsKey(target - nums[i])){
                arr[0] = hashmap.get(target - nums[i]);
                arr[1] = i;
                break;
            }
            hashmap.put(nums[i],i);

        }return arr;
    }
}