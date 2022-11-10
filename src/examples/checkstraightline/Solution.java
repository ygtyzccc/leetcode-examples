package checkstraightline;

public class Solution {
    public boolean checkStraightLine(int[][] coordinates) {

         double slopeRef = calculateSlope(coordinates[0][0], coordinates[0][1], coordinates[1][0], coordinates[1][1]);
         double slope;
        for (int i = 1; i < coordinates.length - 1; ++i) { //[[1,2],[2,3],[3,4],[4,5],[5,6],[6,7]]
            for (int j = 0; j < coordinates[i].length - 1; ++j)
            {
                if (isCordinatesOnYAxis(coordinates[i][j], coordinates[i][j + 1], coordinates[i + 1][j], coordinates[i + 1][j + 1]))
                    return true;

                slope = calculateSlope(coordinates[i][j], coordinates[i][j + 1], coordinates[i + 1][j], coordinates[i + 1][j + 1]);
                if (slope != slopeRef)
                    return false;
            }
        }

        return true;
    }

    public double calculateSlope(int x1, int y1, int x2, int y2)
    {
        int diffX = x1 - x2;
        int diffY = y1 - y2;

        double slope = (double)diffY / diffX;

        return slope;
    }

    public boolean isCordinatesOnYAxis(int x1, int y1, int x2, int y2)
    {
        return x1 - x2 == 0;

    }
}
