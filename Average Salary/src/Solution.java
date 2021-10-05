class Solution {
    public double average(int[] salary) {
        double total = 0,min = Integer.MAX_VALUE,max = Integer.MIN_VALUE;

        for(int i = 0; i < salary.length; i++){
            total += salary[i];
            if(salary[i] < min){
                min = salary[i];
            }
            if(salary[i] > max){
                max = salary[i];
            }
        }

        total = total - (min + max);
        return (total/(salary.length-2));
    }
}