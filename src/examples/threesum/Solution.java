package threesum;

import java.util.*;
import java.util.stream.Collectors;

public class Solution {

    public static boolean areNumsSame(int a, int b, int c){
        return a == b && a == c && b == c;
    }

    public static List<List<Integer>> threeSum(int[] nums) {

        List<List<Integer>> resultList = new ArrayList<>(  );
        if (nums.length < 3)
            return new ArrayList<>();

        Set<Integer> numsSet = new HashSet<>(Arrays.stream(nums).boxed().collect(Collectors.toList()));
        List<Integer> numList = new ArrayList<>(numsSet);
        int setSize = numsSet.size();

        for (int i = 0; i < setSize; ++i)
            for (int j = i + 1; j < setSize; ++j)
                for (int k = j + 1; k < setSize; ++k)
                    if (!areNumsSame(i, j, k) && numList.get(i) + numList.get(j) + numList.get(k) == 0) {
                       List<Integer> results = new ArrayList<>();

                       results.add(numList.get(i));
                       results.add(numList.get(j));
                       results.add(numList.get(k));

                        resultList.add(results);

                    }


        return resultList;

    }
}
