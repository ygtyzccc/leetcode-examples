package isbadversion;

import javax.swing.*;
import java.util.Random;
import java.util.stream.IntStream;

class Solution {
    public int firstBadVersion(int n) {
        int left = 1;
        int right = n;

        while (left < right) {
            int mid = left + (right - left) / 2;

            if (!isBadVersion(mid))
                left = mid + 1;
            else
                right = mid;

        }
        return left;
    }

    public boolean isBadVersion(int n) {
        return new Random().nextBoolean();
    }
}
