import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<List<Integer>> generate(int numRows) {

        List<List<Integer>> list = new ArrayList<>();
        List<Integer> listChild;

        for(int i = 1; i <= numRows; i++){

            listChild = new ArrayList<>();
            for(int j = 1; j <= i; j++){
                int answer;
                if(j == 1 || j == i){
                    answer = 1;
                }
                else{
                    //-2 because index starts from 0 and our i,j starts from 1 so -1 for this, and we have to search for previous index so -1, so total -2

                    answer = list.get(i - 2).get(j-2) + list.get(i - 2).get(j-1);
                }

                listChild.add(answer);
            }
            list.add(listChild);
        }return list;
    }
}