import java.util.HashMap;

class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer,Integer> hashmap = new HashMap<>();

        for (int num : nums) {
            if (hashmap.containsKey(num)) {
                hashmap.put(num, hashmap.get(num) + 1);
            } else {
                hashmap.put(num, 1);
            }
            if (hashmap.get(num) > nums.length / 2) {
                return num;
            }
        }
        return 0;
    }
}