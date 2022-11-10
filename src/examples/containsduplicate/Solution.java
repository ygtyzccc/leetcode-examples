package containsduplicate;

import java.util.HashSet;

class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> numbers = new HashSet<>();

        for (int val: nums) {
            if (!numbers.add(val))
                return true;
        }
        return false;

    }
}