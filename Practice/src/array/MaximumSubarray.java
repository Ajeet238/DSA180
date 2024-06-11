package array;

public class MaximumSubarray {
	public int maxSubArray(int[] nums) {

		int maxSum = Integer.MIN_VALUE;
		int n = nums.length;
		int sum = 0;
		boolean chekPos = false;

		if (n == 1) {
			return nums[0];
		}
		for (int i = 0; i < n; i++) {
			int temp = nums[i] + sum;
			if (temp >= 0) {
				chekPos = true;
				sum = sum + nums[i];
				if (sum > maxSum) {
					maxSum = sum;
				}
			} else {
				sum = 0;
			}
		}
		if (chekPos == false) {
			for (int i = 0; i < n; i++) {
				if (nums[i] > maxSum) {
					maxSum = nums[i];
				}
			}
		}
		return maxSum;
	}
}
