public class Main {

    public static void main(String[] args) {
        Solution solution = new Solution();
        FastSolution fastSolution = new FastSolution();
        System.out.println(solution.findDisappearedNumbers(new int[]{1,4,2,6,2,1}));
        System.out.println(fastSolution.findDisappearedNumbers(new int[]{1,4,2,6,2,1}));
    }
}
