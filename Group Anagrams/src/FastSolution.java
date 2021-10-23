import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

class FastSolution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>> hashmap = new HashMap<>();

        for (String str : strs) {
            char[] a = str.toCharArray();
            Arrays.sort(a);
            String key = String.valueOf(a);

            if (!hashmap.containsKey(key)) {
                hashmap.put(key, new ArrayList<>());
            }
            hashmap.get(key).add(str);
        }

        return new ArrayList<>(hashmap.values());
    }
}