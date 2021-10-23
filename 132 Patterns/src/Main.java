public class Main {

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.find132pattern(new int[]{3,5,0,3,4}));

        FastSolution fastSolution = new FastSolution();
        System.out.println(fastSolution.find132pattern(new int[]{3,5,0,3,4}));
    }
}
