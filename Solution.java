import java.util.Scanner;

/**
 * Created by jhhtaylor on 2017-07-17.
 */
public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double m = in.nextDouble();
        int k = in.nextInt();
        System.out.format("%.3f",poisson(k,m));

    }

    private static double poisson(int k, double lambda) {
        return (Math.pow(lambda, k) * Math.pow(Math.E, -1 * lambda)) / factorial(k);
    }

    private static Long factorial(int n) {
        if (n < 0) {
            return null;
        }
        long result = 1;
        while (n > 0) {
            result *= n--;
        }
        return result;
    }
}
