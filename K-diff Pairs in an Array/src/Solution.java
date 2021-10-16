import java.util.HashMap;
import java.util.Map;

class Solution {
    public int findPairs(int[] nums, int k) {
        int count = 0;
        HashMap<Integer,Integer> hashmap = new HashMap<>();

        for (int num : nums) {
            if (hashmap.containsKey(num)) {
                hashmap.put(num, hashmap.get(num) + 1);
            } else {
                hashmap.put(num, 1);
            }
        }


        if(hashmap.isEmpty()){
            return 0;
        }

        for(Map.Entry<Integer,Integer> m : hashmap.entrySet()){

            if(k == 0){
                if(hashmap.get(m.getKey()) >= 2){
                    count++;
                }
            }else if(hashmap.containsKey(m.getKey() + k)){
                count++;
            }
        }

        return count;
    }
}