package medium;

public class SlidingWindows {
    
    // Function to find the maximum sum subarray of size k
    public static int maxSumSubarray(int[] arr, int k) {
        int maxSum = Integer.MIN_VALUE;
        int currentSum = 0;

        // Calculate sum of first k elements
        for (int i = 0; i < k; i++) {
            currentSum += arr[i];
        }
        //maxSum = Math.max(maxSum, currentSum);
        // Slide the window by 1 element at a time
        for (int i = k; i < arr.length; i++) {
        	maxSum = Math.max(maxSum, currentSum);
            // Add the next element to the current sum
            currentSum += arr[i] - arr[i - k];
            // Update maxSum if necessary
            
        }

        return maxSum;
    }

    public static void main(String[] args) {
        int[] arr = {30, 2, 1, 7, 8, 1, 4, 8, 1, 0};
        int k = 3;
        System.out.println("Maximum sum of subarray of size " + k + ": " + maxSumSubarray(arr, k));
    }
}
