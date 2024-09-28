public class MathUtil {

    // Static Methods

    /**
     * Checks whether a number is prime.
     * @param n the number to check.
     * @return true if the number is prime, otherwise false.
     */
    public static boolean isPrime(int n) {
        if (n <= 1) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        return true;
    }

    /**
     * Calculates the greatest common divisor (GCD) of two integers.
     * Uses the Euclidean algorithm.
     * @param a the first number.
     * @param b the second number.
     * @return the GCD of a and b.
     */
    public static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    /**
     * Calculates the least common multiple (LCM) of two integers.
     * @param a the first number.
     * @param b the second number.
     * @return the LCM of a and b.
     */
    public static int lcm(int a, int b) {
        return (a * b) / gcd(a, b);
    }

    /**
     * Returns the nth Fibonacci number.
     * @param n the position of the Fibonacci sequence.
     * @return the nth Fibonacci number.
     */
    public static int fibonacci(int n) {
        if (n <= 1) return n;
        int a = 0, b = 1, fib = 1;
        for (int i = 2; i <= n; i++) {
            fib = a + b;
            a = b;
            b = fib;
        }
        return fib;
    }

    /**
     * Calculates the factorial of a number.
     * @param n the number to calculate factorial of.
     * @return the factorial of n.
     */
    public static int factorial(int n) {
        if (n == 0) return 1;
        int fact = 1;
        for (int i = 2; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }

    // Non-static methods

    /**
     * Checks if a number is a perfect number.
     * A perfect number is equal to the sum of its divisors excluding itself.
     * @param n the number to check.
     * @return true if n is a perfect number, otherwise false.
     */
    public boolean isPerfectNumber(int n) {
        int sum = 1; // 1 is always a divisor
        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) {
                sum += i;
            }
        }
        return sum == n && n != 1;
    }

    /**
     * Calculates the sum of digits of a number.
     * @param n the number.
     * @return the sum of the digits of n.
     */
    public int sumOfDigits(int n) {
        int sum = 0;
        while (n != 0) {
            sum += n % 10;
            n /= 10;
        }
        return sum;
    }

    /**
     * Reverses the digits of a number.
     * @param n the number.
     * @return the number formed by reversing the digits of n.
     */
    public int reverseNumber(int n) {
        int reversed = 0;
        while (n != 0) {
            reversed = reversed * 10 + n % 10;
            n /= 10;
        }
        return reversed;
    }

    /**
     * Checks if a number is an Armstrong number.
     * An Armstrong number is equal to the sum of its own digits each raised to the power of the number of digits.
     * @param n the number to check.
     * @return true if n is an Armstrong number, otherwise false.
     */
    public boolean isArmstrongNumber(int n) {
        int original = n, sum = 0, digits = String.valueOf(n).length();
        while (n != 0) {
            sum += Math.pow(n % 10, digits);
            n /= 10;
        }
        return sum == original;
    }

    /**
     * Finds the smallest prime number greater than n.
     * @param n the number.
     * @return the next prime number after n.
     */
    public int nextPrime(int n) {
        int candidate = n + 1;
        while (!isPrime(candidate)) {
            candidate++;
        }
        return candidate;
    }

    // Main method to test the MathUtil class
    public static void main(String[] args) {
        // Testing static methods
        System.out.println("Static Method Tests:");
        System.out.println("isPrime(11): " + MathUtil.isPrime(11));
        System.out.println("gcd(24, 18): " + MathUtil.gcd(24, 18));
        System.out.println("lcm(24, 18): " + MathUtil.lcm(24, 18));
        System.out.println("fibonacci(7): " + MathUtil.fibonacci(7));
        System.out.println("factorial(5): " + MathUtil.factorial(5));

        // Create an object of MathUtil to test non-static methods
        MathUtil mathUtil = new MathUtil();

        System.out.println("\nNon-Static Method Tests:");
        System.out.println("isPerfectNumber(28): " + mathUtil.isPerfectNumber(28));
        System.out.println("sumOfDigits(1234): " + mathUtil.sumOfDigits(1234));
        System.out.println("reverseNumber(1234): " + mathUtil.reverseNumber(1234));
        System.out.println("isArmstrongNumber(153): " + mathUtil.isArmstrongNumber(153));
        System.out.println("nextPrime(14): " + mathUtil.nextPrime(14));
    }
}
