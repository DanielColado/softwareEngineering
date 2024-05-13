package source;

public class MathFunctions {

    public int countPartitions(int n) {
        int[] dp = new int[n + 1];
        dp[0] = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = i; j <= n; j++) {
                dp[j] += dp[j - i];
            }
        }
        return dp[n];
    }

    public String generateFibonacci(int n) throws IllegalArgumentException {
        if (n < 0) {
            throw new IllegalArgumentException("Input cannot be negative");
        }

        StringBuilder fibonacciSequence = new StringBuilder();
        int a = 0, b = 1;

        if (n >= 1) {
            fibonacciSequence.append(a).append(" ");
        }
        if (n >= 2) {
            fibonacciSequence.append(b).append(" ");
        }
        for (int i = 2; i < n; i++) {
            int next = a + b;
            fibonacciSequence.append(next).append(" ");
            a = b;
            b = next;
        }

        return fibonacciSequence.toString();
    }

    public int factorial(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("The factorial is not defined for negative numbers.");
        }
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }
}
