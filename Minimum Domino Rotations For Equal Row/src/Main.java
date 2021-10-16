public class Main {

    public static void main(String[] args) {
        Solution solution = new Solution();
        FastSolution fastSolution = new FastSolution();
        System.out.println(solution.minDominoRotations(new int[]{2,1,2,4,2,2},new int[]{5,2,6,2,3,2}));
        System.out.println(fastSolution.minDominoRotations(new int[]{2,1,2,4,2,2},new int[]{5,2,6,2,3,2}));
    }
}
