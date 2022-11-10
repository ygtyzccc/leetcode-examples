package longestcommonprefix;

public class Solution {

    public static String compareTwoString(String str1, String str2)
    {
        int n = str1.length();
        int m = str2.length();
        String prefix = "";

        for (int i = 0, j = 0; i < n && j < m; ++i, ++j)
            if (str1.charAt(i) == str2.charAt(j))
                prefix += str1.charAt(i);
            else
                return prefix;

        return prefix;
    }

    public static String longestCommonPrefix(String[] strs) {

        String prefix = compareTwoString(strs[0], strs[1]);

        for (int i = 1; i < strs.length; ++i)
            prefix = compareTwoString(prefix, strs[i]);

        return prefix;
    }
}
