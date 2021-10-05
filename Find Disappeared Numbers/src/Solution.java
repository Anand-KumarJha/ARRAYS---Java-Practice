import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        int n = nums.length;
        List<Integer> numbers = new ArrayList<>();
        List<Integer> numbers1 = new ArrayList<>();

        for (int num : nums) {
            numbers.add(num);
        }

        for(int i = 1; i <= n; i++){
            if(!numbers.contains(i)){
                numbers1.add(i);
            }
        }
        return numbers1;
    }
}