package erenmulakat;

public class Solution {
    public static String timeDiff(String str)
    {
        String timeSuffix1 = str.substring(5, 7);
        String timeSuffix2 = str.substring(12, 14);
        String result;

        int hour1 = Integer.parseInt(str.substring(0, 2));
        int hour2 = Integer.parseInt(str.substring(8, 10));

        int minute1 = Integer.parseInt(str.substring(3,5));
        int minute2 = Integer.parseInt(str.substring(11,13));

        if (timeSuffix1.equals("PM"))
            hour1 += 12;

        if (timeSuffix2.equals("PM"))
            hour2 += 12;

        int time1 = hour1 * 60 + minute1;
        int time2 = hour2 * 60 + minute2;

        int diff = Math.abs(time1 - time2);


        if (time1 <= time2) {
            result = diff + "";
            return result ;
        }
        result = (24 * 60 - diff) + "";

        return result;
    }
}
