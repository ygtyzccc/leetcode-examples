package arrayleftrotation;

import java.util.ArrayList;
import java.util.List;

public class Result {

    /*
     * Complete the 'rotateLeft' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts following parameters:
     *  1. INTEGER d
     *  2. INTEGER_ARRAY arr
     */

    public static List<Integer> rotateLeft(int d, List<Integer> arr) {
        // Write your code here
        int n = d % arr.size();
        int lastIndexNo = arr.size() - 1;
        int newIndex;
        List<Integer> newArr = new ArrayList<>(arr);

        for (int i = 0; i < arr.size(); ++i) {
            if (i - n < 0)
                 newIndex = arr.size() - n + i;
            else
                newIndex = i - n;

            newArr.set(newIndex, arr.get(i));
        }

        return newArr;
    }

}