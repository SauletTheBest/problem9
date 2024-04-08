import java.util.Scanner;

/**
 * This class calculates the binomial coefficient C(n, k).
 */
public class Problem9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read the values of n and k from the user
        int n = sc.nextInt();
        int k = sc.nextInt();

        // Output the binomial coefficient C(n, k)
        System.out.println("C(" + n + ", " + k + ") = " + binomialCoefficient(n, k));
    }

    /**
     * Calculates the binomial coefficient C(n, k).
     *
     * @param n The value of n.
     * @param k The value of k.
     * @return The binomial coefficient C(n, k).
     */
    public static int binomialCoefficient(int n, int k) {
        // Create an array to store binomial coefficients
        int[] dp = new int[k + 1];

        // Base case initialization
        dp[0] = 1;

        // Calculate binomial coefficients using dynamic programming
        for (int i = 1; i <= n; i++) {
            for (int j = Math.min(i, k); j > 0; j--) {
                dp[j] = dp[j] + dp[j - 1];
            }
        }
        return dp[k];
    }
}
