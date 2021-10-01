public class Main {

    public static void main(String[] args) {
	    Solution solution = new Solution();
        int[] nums = new int[]{2,0,2,1,1,0};
        solution.sortColors(nums);
        System.out.println();
        FastSolution fastSolution = new FastSolution();
        fastSolution.sortColors(nums);
    }
}
