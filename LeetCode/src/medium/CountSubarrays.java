package medium;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

/*ou are given an integer array nums and a positive integer k.Return the number of subarrays where
 *  the maximum element of nums appears at least k times in that subarray. A subarray is a contiguous
 *   sequence of elements within an array.
Example 1:

Input: nums = [1,3,2,3,3], k = 2 Output: 6  Explanation: The subarrays that contain the element 3 
at least 2 times are: [1,3,2,3], [1,3,2,3,3], [3,2,3], [3,2,3,3], [2,3,3] and [3,3].

*/

public class CountSubarrays {
	public static void main(String[] args) {
		int[] a = { 1,4,2,1,4,4 };
		int k = 2;
		CountSubarrays cs=new CountSubarrays();
		System.out.println(cs.countSubarrays(a, k));

	}

	public  long countSubarrays(int[] nums, int k) {
		if(nums.length<k) return 0;
		int max = nums[0];
		for (int i = 1; i < nums.length; i++) {
			if (nums[i] > max)
				max = nums[i];
		}
		int count=0;
		int lowerbound, upperboud;
		int len = nums.length; // sliding window algorigthm to go througth all sub array of at least size (k)
		for (int i = len - 1; i >= k - 1; i--) {
			for (int j = i; j < len; j++) {
				lowerbound=j-i;
				upperboud=j;
				
				if(findfrequency(nums, lowerbound, upperboud, max)>=k)
				{
					count++;
				}
					
			}
		}
		return count;
	}


	
	//private method to find frequencty
	private int findfrequency(int[] arr, int lb, int ub, int max )
	{
		int freq=0;
		for(int i=lb; i<=ub; i++)
		{
			if(arr[i]==max)
				freq++;
		}
		return freq;
		
		
	}

}
