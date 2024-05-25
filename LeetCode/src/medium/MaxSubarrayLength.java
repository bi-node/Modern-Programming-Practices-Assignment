package medium;

import java.util.HashMap;
import java.util.Map;

/*
  Input: nums = [1,2,3,1,2,3,1,2], k = 2
Output: 6
Explanation: The longest possible good subarray is [1,2,3,1,2,3] since the values
 1, 2, and 3 occur at most twice in this subarray. Note that the subarrays [2,3,1,2,3,1] 
 and [3,1,2,3,1,2] are also good.
It can be shown that there are no good subarrays with length more than 6.
 * /
 */
public class MaxSubarrayLength {

	public static void main(String[] args) {
		MaxSubarrayLength test = new MaxSubarrayLength();
		int[] arr = { 1, 2, 3, 1, 2, 3, 1,2 };
		int k = 2;
		System.out.println(test.maxSubarrayLength(arr, k));

	}

	public int maxSubarrayLength(int[] nums, int k) {
		
		int upperbound=0;
		int lowerboud=0;
		if (goodarray(nums, 0, nums.length - 1, k))
			return nums.length;
		int a = nums.length - 1;
		for (int i = a -1; i >0; i--) {
			for (int j = i; j < nums.length; j++) {
				if (goodarray(nums, j - i, j, k))
				{
					upperbound=j;
					lowerboud=j-i;
					break;
				}
			}
		}
		return upperbound-lowerboud+1;

	}

	private boolean goodarray(int[] a, int lowerbound, int upperbound, int deg) {
		Map<Integer, Integer> mapFrequency = new HashMap<Integer, Integer>();
		for (int i = lowerbound; i <= upperbound; i++) {
			mapFrequency.put(a[i], mapFrequency.getOrDefault(a[i], 0) + 1);
		}

		for (Map.Entry<Integer, Integer> entry : mapFrequency.entrySet()) {

			if (entry.getValue() != deg)
				return false;
		}
		return true;

	}

}
