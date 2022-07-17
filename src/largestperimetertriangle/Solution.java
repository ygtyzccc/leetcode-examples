package largestperimetertriangle;

import java.util.Arrays;

public class Solution {
    public int largestPerimeter(int[] nums) {
        Arrays.sort(nums);

        for (int i = nums.length - 1; i >= 2; --i) {
            int j = i - 1;
            int k = j - 1;

                if (!isTriangle(nums[i], nums[j], nums[k]))
                    continue;
                else
                    return nums[i] + nums[j] + nums[k];
        }

        return 0;
    }

    public static boolean isTriangle(int a, int b, int c)
    {
        return c + b > a;
    }
}
