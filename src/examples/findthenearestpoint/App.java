package findthenearestpoint;

import java.util.Arrays;

public class App {
    public static void main(String[] args) {
        int [][] nums = {{1, 2}, {3, 1}, {2, 4}, {2, 3}, {4, 4}};
        int x = 3;
        int y = 4;

        Solution slt = new Solution();

        slt.nearestValidPoint(x, y, nums);

    }
}
