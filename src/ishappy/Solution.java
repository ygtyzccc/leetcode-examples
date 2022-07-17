package ishappy;

import java.util.HashSet;

public class Solution {
    public boolean isHappy(int n) // 123
    {
        int total = 0;
        HashSet<Integer> seen = new HashSet<>();

        do {
            total = 0;
            while (n != 0) {
                total += (n % 10) * (n % 10);
                n /= 10;
            }


            if (!seen.contains(total))
                seen.add(total);
            else
                return false;
            n = total;

        } while (total != 1);
    return true;
    }
}
