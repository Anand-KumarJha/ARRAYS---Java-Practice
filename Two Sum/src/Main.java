public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        solution.twoSum(new int[]{2,7,11,15},9);

        int[] a = FastSolution.twoSum(new int[]{2,3,4,8},6);
        for(int i: a){
            System.out.println(i);
        }
    }
}
