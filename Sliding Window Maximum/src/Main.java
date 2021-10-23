import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(Arrays.toString(solution.maxSlidingWindow(new int[]{1,3,-1,-3,5,3,6,7},3)));
        FastSolution fastSolution = new FastSolution();
        System.out.println(Arrays.toString(fastSolution.maxSlidingWindow(new int[]{1,3,-1,-3,5,3,6,7},3)));
    }
}
