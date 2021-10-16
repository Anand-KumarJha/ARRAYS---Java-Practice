public class Main {

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.numSubarrayProductLessThanK(new int[]{10,5,2,6},100));

        FastSolution fastSolution = new FastSolution();
        System.out.println(fastSolution.numSubarrayProductLessThanK(new int[]{10,5,2,6},100));
    }
}
