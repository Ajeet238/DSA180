package array;

public class MoveZeroToEnd {
	
	public void moveZeroes(int[] nums) {
		// 1 0 2 0 3 4
		int n = nums.length;
		int firstZero = -1;
		int j = 0;
		if (n == 1 || n == 0) {
			return;
		}
		for (int i = 0; i < n; i++) {
			if (nums[i] == 0) {
				firstZero = i;
				j = i + 1;
				break;
			}
		}

		if (firstZero == -1) {
			return;
		}

		while (j < n) {
			if (nums[j] == 0) {
				j++;
			} else {
				nums[firstZero] = nums[j];
				nums[j] = 0;
				firstZero++;
				;
				j++;
			}
		}
	}
}
