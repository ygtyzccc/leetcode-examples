package erenmulakat;

public class Question3 {
    public static int searchingChallenge(String str)
    {
        int total = 0;
        int result;
        int lettersCount = 0;


        for (int i = 0; i < str.length(); ++i) {
            if (Character.isDigit(str.charAt(i)))
                total += Integer.parseInt(str.charAt(i) + "");
            if (Character.isAlphabetic(str.charAt(i)))
                ++lettersCount;
        }

        return (int) Math.round(total / (double)lettersCount);

    }
}
