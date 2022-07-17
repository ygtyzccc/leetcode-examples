package threesumclose;

public class Solution {
    public static int threeSumClosest(int[] nums, int target) {

        int difference;
        int minDifferenc = Integer.MAX_VALUE;
        int sum = 0;
        int diffTotal = 0;

        for (int i = 0; i < nums.length; ++i)
            for (int j = i + 1; j < nums.length; ++j)
                for (int k = j + 1; k < nums.length; ++k) {

                    difference = Math.abs(target - nums[i] + nums[j] + nums[k]);

                    if (difference < minDifferenc) {
                        minDifferenc = difference;
                        int[] result = {nums[i], nums[j], nums[k]};

                        diffTotal = nums[i] + nums[j] + nums[k];
                    }
                }

    return diffTotal;
    }
}