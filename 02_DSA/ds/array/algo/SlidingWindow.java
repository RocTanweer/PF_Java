package ds.array.algo;

public class SlidingWindow {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6};
        int k = 2;

        maxSumSubArrayk1(arr, k);
    }

    // Fixed Window
    public static void maxSumSubArrayk1(int[] arr, int k) {
        int l = 0, r = 0;
        int sum = 0, maxSum = 0;

        while (r < k) {
            sum += arr[r++];
        }

        maxSum = sum;

        while (r < arr.length) {
            sum = sum - arr[l];
            l++;
            sum = sum + arr[r];
            maxSum = Math.max(maxSum, sum);
            r++;
        }

        System.out.println(maxSum);
    }

    public static void maxSumSubArrayk2(int[] arr, int k) {
        int sum = 0, maxSum = 0, l = 0;

        for (int r = 0; r < arr.length; r++) {
            sum = sum + arr[r];

            if (r >= k - 1) {
                maxSum = Math.max(maxSum, sum);
                sum = sum - arr[l];
                l++;
            }
        }

        System.out.println(maxSum);
    }



    // Dynamic Window
    // longestSubArraySumLessThanK (BF)
    public static void longestSubArraySumLessThanKBF(int[] arr, int k) {
        int n = arr.length;
        int maxLen = 0, maxSum = 0;
        int start = 0, end = 0;

        for (int i = 0; i < n; i++) {

            int subArraySum = 0;
            for (int j = i; j < n; j++) {

                subArraySum += arr[j];

                if (subArraySum <= k) {
                    int currentLen = j - i + 1;

                    if (currentLen > maxLen) {
                        maxLen = currentLen;
                        maxSum = subArraySum;
                        start = i;
                        end = j;
                    } else if (currentLen == maxLen && subArraySum > maxSum) {
                        maxSum = subArraySum;
                        start = i;
                        end = j;
                    }
                } else break;

            }

        }

        System.out.println(maxLen);

        System.out.print("[");
        for (int i = start; i <= end; i++){
            if (i != end) {
                System.out.print(arr[i] + ", ");
            } else {
                System.out.print(arr[i] + "]");
            }
        }
    }

    // longestSubArraySumLessThanK (Better)
    public static void longestSubArraySumLessThanKBetter(int[] arr, int k) {
        int n = arr.length;
        int l = 0, r = 0;

        int maxLen = 0;

        int subArraySum = 0;
        while (r < n) {
            subArraySum += arr[r];

            while (subArraySum > k) {
                subArraySum -= arr[l++];
            }

            maxLen = Math.max(maxLen, r - l + 1);
            r++;
        }

        System.out.println(maxLen);
    }
}



