public class Main {

    public static void main(String[] args) {
        Solution solution = new Solution();
        FastSolution fastSolution = new FastSolution();

        System.out.println(solution.isAnagram("",""));
        System.out.println(solution.groupAnagrams(new String[]{"eat","tea","tan","ate","nat","bat"}));
        System.out.println(fastSolution.groupAnagrams(new String[]{"eat","tea","tan","ate","nat","bat"}));
    }
}
