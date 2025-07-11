package jf.practice;

public class NumberPractice {
    public static void main(String[] args) {
        String result = evenOrOdd(5);
        System.out.println(result);
    }

    static String evenOrOdd(int num) {
        if (num % 2 == 0) {
            return "Even";
        } else {
            return "Odd";
        }
    }

    public static int greatestOf3(int x, int y, int z) {
        // Lack of edge case handling (nature of input)
        //        if (x > y && x > z) {
        //            return x;
        //        } else if (y > x && y > z) {
        //            return y;
        //        } else return z;

        //  Correct way
        if (x >= y && x >= z) {
            return x;
        } else if (y >= x && y >= z) {
            return y;
        } else return z;
    }

    public static void evenOddCounter(int n) {
        if (n < 1) {
            System.out.println("Invalid input");
            return;
        }

        int evenCount = 0, oddCount = 0;

        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
        }

        System.out.printf("Number of evens: %d\n", evenCount);
        System.out.printf("Number of odds: %d\n", oddCount);
    }

    public static int addDigits(int n) {
        // Modulo of -ve number gives -ve result
        n = Math.abs(n);

        int result = 0;

        while (n != 0) {
            int digit = n % 10;
            result += digit;

            n /= 10;
        }

        return result;
    }

    public static int countDigits(int n) {
        if (n == 0) return 1; // Stupid mistake

        n = Math.abs(n); // Handles negative numbers
        int result = 0;

        while (n != 0) {
            n /= 10;
            result++;
        }

        return result;
    }

    public static int intExpo(int base, int power) {
        int result = 1;

        for (int i = 0; i < power; i++) {
            result *= base;
        }

        return result;
    }

    public static boolean checkArmstrong(int n) {
        n = Math.abs(n);

        int input = n;
        int poweredDigitsSum = 0;

        int numOfDigits = countDigits(n);

        while (n != 0) {
            int lastDigit = n % 10;
            poweredDigitsSum += intExpo(lastDigit, numOfDigits);
            n /= 10;
        }

        return poweredDigitsSum == input;
    }

    public static int sumOfFirstN(int n) {
        int sum = 0;

        for (int i = 1; i <= n; i++) {
            sum += i;
        }

        return sum;
    }

    public static String allFactors(int n) {
        StringBuilder result = new StringBuilder();

        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                result.append(i).append(" ");
            }
        }

        return result.toString();
    }

    public static int reverseDigits(int n) {
        // Why it is better?
        int sign = n < 0 ? -1 : 1;
        n = Math.abs(n);

        int result = 0;

        while (n != 0) {
            int lastDigit = n % 10;
            result = result * 10 + lastDigit;
            n /= 10;
        }

        return result * sign; // why better?
    }

    public static boolean palindromeCheck(int n) {
        int reversed = reverseDigits(n);
        return n == reversed;
    }

    public static boolean checkPrime(int n) {
        if (n <= 1) return false; // important fix

        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static int factLoop(int n) {
        if (n < 0) return -1; // indicates invalid input

        if (n == 0) return 1;

        int result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }

        return result;
    }

    public static boolean isLeapYear(int year) {
        if (year < 0) {
            System.out.println("Invalid year");
            return false;
        }

        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            return true;
        } else {
            return false;
        }
    }

    public static int gcdLoop(int m, int n) {
        if (m == 0 || n == 0) return -1; // indicating invalid input

        // Since GCD is defined on positive integers only
        m = Math.abs(m);
        n = Math.abs(n);

        // Make sure m > n
        if (m < n) {
            int temp = m;
            m = n;
            n = temp;
        }

        // Calculating GCD
        int rem;
        while (true) {
            rem = m % n;
            if (rem == 0) break;

            m = n;
            n = rem;
        }

        return n;
    }

    public static long factorial(int n) {
        if (n < 0) {
            return -1;
        }

        long ans = 1;

        for (int i = n; i > 0; i--) {
            ans *= i;
        }

        return ans;
    }

    public static void fibonacci(int n) {
        if (n < 1) {
            System.out.println("Invalid Argument");
            return;
        }

        int i = 1;
        int prev1 = 1;
        int prev2 = 0;
        while (i <= n) {
            if (i == 1) {
                System.out.printf("%d ", prev2);
                i++;
            } else if (i == 2) {
                System.out.printf("%d ", prev1);
                i++;
            } else {
                int newTerm = prev1 + prev2;
                System.out.printf("%d ", newTerm);
                prev2 = prev1;
                prev1 = newTerm;
                i++;
            }
        }
    }

}
