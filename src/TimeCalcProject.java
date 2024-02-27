/**
 * TimeCalcProject
 */
public class TimeCalcProject {

    public static int sumOfSquares(int n) {
        int result = 0;
        for (int i = 1; i <= n; i++) {
            result += i * i;
        }
        return result;
    }

    public static void main(String[] args) {
        int sum = sumOfSquares(10);
        System.out.println(sum);
    }
}