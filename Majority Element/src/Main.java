import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.majorityElement(new int[]{2,2,1,1,1,2,2}));

        FastSolution fastSolution = new FastSolution();
        System.out.println(fastSolution.majorityElement(new int[]{2,2,1,1,1,2,2}));

        String s = "am";
        Pattern pattern = Pattern.compile(s);
        Matcher matcher = pattern.matcher("i am java");

        System.out.println(matcher.find());
    }
}
