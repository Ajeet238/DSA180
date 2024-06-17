package array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSumUsingTwoPointer {
	public List<List<Integer>> threeSum(int[] nums) {
		int n = nums.length;
		Arrays.sort(nums);
		List<List<Integer>> parent = new ArrayList<>();

		for (int i = 0; i < n; i++) {

			if (i != 0 && nums[i] == nums[i - 1]) {
				continue;
			}

			int sec = i + 1;
			int third = n - 1;
			while (sec < third) {

				if (nums[i] + nums[sec] + nums[third] > 0) {
					third--;
				} else if (nums[i] + nums[sec] + nums[third] < 0) {
					sec++;
				} else {

					List<Integer> child = Arrays.asList(nums[i], nums[sec], nums[third]);
					parent.add(child);
					sec++;
					third--;

					while (sec < third && nums[sec] == nums[sec - 1]) {
						sec++;
					}
					while (sec < third && nums[third] == nums[third + 1]) {
						third--;
					}
				}

			}
		}
		return parent;
	}
}
