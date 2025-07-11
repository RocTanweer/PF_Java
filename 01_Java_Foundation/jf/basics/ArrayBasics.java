package jf.basics;

public class ArrayBasics {
    public static void main(String[] args) {
        // Declaration and Initialization
        int[] nums = new int[5];  // array of size 5, default 0
        int[] primes = {2, 3, 5, 7, 11}; // direct initialization

        // Accessing Elements
        System.out.println(primes[2]); // Output: 5

        // Modifying elements
        nums[0] = 10;
        nums[1] = 20;

        // Iterating using for loop
        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i]);
        }

        // Iterating using enhanced for-loop
        for (int val: primes) {
            System.out.println(val);
        }

        // sum of array elements
        int sum = 0;
        for (int val: primes) {
            sum += val;
        }
        System.out.println("sum: " + sum);

        // Finding max value
        int max = primes[0];
        for (int val: primes) {
            if (val > max) max = val;
        }
        System.out.println("Max: "+ max);

        // Reversing an array (in-place)
        for (int i = 0; i < nums.length / 2; i++) {
            int temp = nums[i];
            nums[i] = nums[nums.length - 1 - i];
            nums[nums.length - 1 - i] = temp;
        }

        // Printing reversed array
        for (int val: nums) {
            System.out.println(val);
        }

        // Copying an array
        int[] copy = new int[primes.length];
        for (int i = 0; i < primes.length; i++) {
            copy[i] = primes[i];
        }

        // Multidimensional Array
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6}
        };

        // Iterating 2D array
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
