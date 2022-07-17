package softtechmulakat;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class Solution {

    public static int largest(int[] arr)
    {
        int i;

        // Initialize maximum element
        int max = arr[0];

        // Traverse array elements from second and
        // compare every element with current max
        for (i = 1; i < arr.length; i++)
            if (arr[i] > max)
                max = arr[i];

        return max;
    }


    public static int [] getHistogramData(int [] a, int n) //[0, n]
    {
        int [] counts = new int[n + 1];
        //   1 3 5 1 2 3
        // 0 2 1 2 0 1 0
        for (int val : a)
            ++counts[val];

        return counts;
    }

    public static int digitsSum(int num)
    {
        int sum = 0;

        while (num != 0) {

            sum += num % 10;
            num /= 10;

        }

        return sum;
    }

    public static int findPossibleWinners(int n)
    {
        int[] nums = new int[n];
        int[] numsDigitSum = new int[n];

        for (int i = 0; i < n; ++i) {
            nums[i] = i + 1;
            numsDigitSum[i] = Solution.digitsSum(nums[i]);
        }
         Arrays.sort(numsDigitSum);

        Arrays.stream(nums).forEach((i) -> System.out.printf("%d ", i));
        System.out.println();
        Arrays.stream(numsDigitSum).forEach((i) -> System.out.printf("%d ", i));

        int [] counts = Solution.getHistogramData(numsDigitSum, n);
        System.out.println();
        Arrays.stream(counts).forEach((i) -> System.out.printf("%d ", i));

        int max = Solution.largest(counts);
        int s = 0;

        for (int i: counts) {
            if (max == i)
                ++s;

        }

        return s;
    }
}

