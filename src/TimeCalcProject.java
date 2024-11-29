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
    }//big(n)
    public static int sumOfSquares2(int n) {
        return n*n*n/3 + n*n/2+ n/6;
     }//bigO(1)
    

    public static void main(String[] args) {
        int sum = sumOfSquares(10);
        System.out.println(sum);

        int sum2 = sumOfSquares2(10);
        System.out.println(sum);
    }
}