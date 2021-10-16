class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int index = -1,gap = 0,total = 0,current = 0;

        for(int i = 0; i < gas.length; i++){
            gap = gas[i] - cost[i];
            current += gap;
            total += gap;

            if(current < 0){
                current = 0;
                index = i;
            }
        }

        if(total >= 0){
            return index+1;
        }

        return -1;
    }
}