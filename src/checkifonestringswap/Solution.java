package checkifonestringswap;

import java.util.HashMap;

public class Solution {
    public boolean areAlmostEqual(String s1, String s2) {

        HashMap<Character, Integer> letterCountMap1 = new HashMap<>();
        HashMap<Character, Integer> letterCountMap2 = new HashMap<>();

        if (s1.length() != s2.length())
            return false;

        int countDiffChar = 0;

        if (s1.length() == 2 && !s1.equals(s2))
            return false;

        for (int i = 0; i < s1.length(); ++i) {
            if (s1.charAt(i) != s2.charAt(i))
                ++countDiffChar;

            if (countDiffChar > 2)
                return false;

            if (!letterCountMap1.containsKey(s1.charAt(i)))
                letterCountMap1.put(s1.charAt(i), 1);
            else {
                int recentVal = letterCountMap1.get(s1.charAt(i));
                letterCountMap1.put(s1.charAt(i), ++recentVal);
            }

            if (!letterCountMap2.containsKey(s2.charAt(i)))
                letterCountMap2.put(s2.charAt(i), 1);
            else {
                int recentVal = letterCountMap2.get(s2.charAt(i));
                letterCountMap2.put(s2.charAt(i), ++recentVal);
            }
        }
        return letterCountMap1.equals(letterCountMap2);
    }
}
