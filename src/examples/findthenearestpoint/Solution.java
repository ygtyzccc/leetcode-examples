package findthenearestpoint;

public class Solution {
    public int nearestValidPoint(int x, int y, int[][] points) {

        int min = Integer.MAX_VALUE;
        int smallestIndex = -1;

        for (int i = points.length - 1; i >= 0 ; --i) {
           int pointX = points[i][0];
           int pointY = points[i][1];

           if (pointX != x && pointY != y)
                continue;

            if (distance(x, y, pointX, pointY) <= min) {
                smallestIndex = i;
                min = distance(x, y, pointX, pointY);
            }
        }
      return smallestIndex;
    }

    public static int distance(int x1, int y1, int x2, int y2)
    {
        return Math.abs(x1 - x2) + Math.abs(y1 - y2);
    }
}
