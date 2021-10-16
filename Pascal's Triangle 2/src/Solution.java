import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> list = new ArrayList<>();

        for(int i = 0; i <= rowIndex; i++){
            list.add(1);

            for(int j = i - 1; j > 0 && i > 1; j--){
                list.set(j,list.get(j) + list.get(j-1));
            }
        }
        return list;
    }
}