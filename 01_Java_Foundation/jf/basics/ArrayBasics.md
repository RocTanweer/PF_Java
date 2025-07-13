```java
package jf.basics;

import java.util.Arrays;

public class ArrayBasics {
    public static void main(String[] args) {
        // ARRAY BASICS \\

        // Declaration and Initialization
        int[] nums = new int[5]; // array of size 5, default 0
        /*
	        int, short, byte, long → 0
	        float, double → 0.0
	        boolean → false
	        char → '\u0000'
	        Objects (like String) → null
        */
        int[] primes = {2, 3, 5, 7, 11}; // direct initialization

        // Accessing elements
        System.out.println(primes[2]); // Output: 5

        // Modifying elements
        nums[0] = 10;
        nums[1] = 20;

        // Iterating using for loop
        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i]);
        }

        // Iterating using enhanced for-loop
        for (int val : primes) {
            System.out.println(val);
        }

        // Sum of array elements
        int sum = 0;
        for (int val : primes) {
            sum += val;
        }
        System.out.println("Sum: " + sum);

        // Finding max value
        int max = primes[0];
        for (int val : primes) {
            if (val > max) max = val;
        }
        System.out.println("Max: " + max);

        // Reversing an array (in-place)
        for (int i = 0; i < nums.length / 2; i++) {
            int temp = nums[i];
            nums[i] = nums[nums.length - 1 - i];
            nums[nums.length - 1 - i] = temp;
        }

        // Printing reversed array
        for (int val : nums) {
            System.out.println(val);
        }

        // Copying an array
        int[] copy = new int[primes.length];
        for (int i = 0; i < primes.length; i++) {
            copy[i] = primes[i];
        }

        // ARRAY UTILITY CLASSES \\

        int[] x = {3, 1, 2};
        Arrays.sort(x);               // Sort ascending
        System.out.println(Arrays.toString(x)); // Print nicely

        int idx = Arrays.binarySearch(x, 2); // Only on sorted array


        int[][] matrix = new int[2][3]; // 2 rows, 3 columns
        matrix[0][1] = 5;

        int[][] matrix2 = {
                {1, 2, 3},
                {4, 5, 6}
        };

        // MULTI-DIMENSIONAL ARRAYS \\

        // Iterating 2D array
        for (int i = 0; i < matrix2.length; i++) {
            for (int j = 0; j < matrix2[i].length; j++) {
                System.out.print(matrix2[i][j] + " ");
            }
            System.out.println();
        }

        // Jagged Arrays
        int[][] jagged = new int[2][];
        jagged[0] = new int[2]; // row 0 has 2 columns
        jagged[1] = new int[4]; // row 1 has 4 columns


        // ARRAYS OF OBJECTS

        String[] names = new String[3];  // All null initially
        names[0] = "Roc";
    }

    // Passing in method
    public static void printArray(int[] arr) {
        for (int i : arr) System.out.print(i + " ");
    }

    // Returning from method
    public static int[] getArray() {
        return new int[]{1, 2, 3};
    }
}
```