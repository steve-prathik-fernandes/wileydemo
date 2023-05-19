package optimization;

//common sub expression elimination technique
// which aims to eliminate reduntant calculations of the same subexpression with a program.
// calculate once and reuse the results multiple times
public class CommonSubExpression {

    public int calculate(int x, int y) {

//		int result1 = (x * x) + (3 * x) - (2 * y) + 3;
//		int result2 = (x * x) + (3 * x) - (2 * y) + 3;
//		int result3 = (x * x) + (3 * x) - (2 * y) + 3;

        int commonSubExpression = (x * x) + (3 * x) - (2 * y) + 3;
        int res1 = commonSubExpression;
        int res2 = commonSubExpression;
        int res3 = commonSubExpression;

        return x;
    }

    public static void main(String[] args) {

    }
}