public class Main {

    public static void main(String[] args) {
        Solution solution = new Solution();
        TwoPointerSolution twoPointerSolution = new TwoPointerSolution();
        FastSolution fastSolution = new FastSolution();
        System.out.println(solution.maxProduct(new int[]{-2,3,-4}));
        System.out.println(twoPointerSolution.maxProduct(new int[]{-2,3,-4}));
        System.out.println(fastSolution.maxProduct(new int[]{-2,3,-4}));

    }
}
