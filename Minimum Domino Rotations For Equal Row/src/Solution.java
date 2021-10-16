import java.util.Arrays;

//Bruteforce

class Solution {
    public int minDominoRotations(int[] tops, int[] bottoms) {
        int[] tops1 = Arrays.copyOf(tops,tops.length);
        int[] bottoms1 = Arrays.copyOf(bottoms,bottoms.length);
        int count = Integer.MAX_VALUE,count1 = 0,digit,temp;

        for(int i = 0; i < tops1.length; i++){
            digit = tops1[i];
            tops1 = Arrays.copyOf(tops,tops.length);
            bottoms1 = Arrays.copyOf(bottoms,bottoms.length);

            for(int j = 0; j < tops1.length; j++){
                if(tops1[j] != digit){
                    if(bottoms1[j] == digit){
                        temp = tops[j];
                        tops1[j] = bottoms1[j];
                        bottoms1[j] = temp;
                        if(count1 == Integer.MAX_VALUE){count1 = 0;}
                        count1++;
                    }else{
                        count1 = Integer.MAX_VALUE;
                        break;
                    }
                }
            }count = Math.min(count,count1);
        }

        for(int i = 0; i < tops1.length; i++){
            digit = bottoms1[i];
            tops1 = Arrays.copyOf(tops,tops.length);
            bottoms1 = Arrays.copyOf(bottoms,bottoms.length);

            for(int j = 0; j < tops1.length; j++){
                if(bottoms1[j] != digit){
                    if(tops1[j] == digit){
                        temp = tops[j];
                        tops1[j] = bottoms1[j];
                        bottoms1[j] = temp;
                        if(count1 == Integer.MAX_VALUE){count1 = 0;}
                        count1++;
                    }else{
                        count1 = Integer.MAX_VALUE;
                        break;
                    }
                }
            }count = Math.min(count,count1);
        }

        return count == Integer.MAX_VALUE ? -1 : count;
    }
}