package mathchallange;

public class Solution {
    public int calculateFinalResult(String str)
    {
        int result = 0;

        for (int i = 0; i < str.length(); ++i) {
            char ch = str.charAt(i);

            if (ch == '*' || ch == '/') {
                if (ch == '*') {
                    result += Integer.parseInt(str.charAt(i - 1) + "")
                            * Integer.parseInt(str.charAt(i + 1) + "");
                }
                else
                    result += Integer.parseInt(str.charAt(i - 1) + "")
                            / Integer.parseInt(str.charAt(i + 1) + "");
            }


        }
        return result;
    }
}
