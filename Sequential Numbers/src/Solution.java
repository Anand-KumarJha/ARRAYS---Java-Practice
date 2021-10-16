import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<Integer> sequentialDigits(int low, int high) {

        List<Integer> list = new ArrayList<>();

        int value = 0,valued = 0,i = 0,k = low;

        while(k > 0){
            k = k/10;
            value = value * 10 + 9;
        }

        while(valued <= high){
            valued = 0;
            int j = i + 1;
            i = i + 1;

            while(valued <= high){
                if(valued * 10 + j <= value){
                    valued = valued * 10 + j;
                    j++;
                }else{
                    break;
                }
            }
            if(valued <= high && valued >= low){
                list.add(valued);
            }
            if(valued % 10 == 9){
                value = value * 10 + 9;
                i = 0;
            }


        }
        return list;
    }
}