class FastSolution {
    public int minDominoRotations(int[] tops, int[] bottoms) {
        int count = -1;
        for(int i = 1; i < 7; i++){
            int count1 = helper(tops,bottoms,i);
            if(count1 != -1 && (count == -1 || count1 < count)){
                count = count1;
            }
        }return count;
    }

    public int helper(int[] tops, int[] bottoms, int value){
        int top = 0,bottom = 0;
        for(int i = 0; i < tops.length; i++){
            if(tops[i] != value && bottoms[i] != value){
                return -1;
            }
            else if(tops[i] != value){
                top++;
            }else if(bottoms[i] != value){
                bottom++;
            }
        }return Math.min(top,bottom);

    }
}