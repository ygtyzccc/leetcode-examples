package canmakearithmetic;

import java.util.Arrays;

class Solution {
    public boolean canMakeArithmeticProgression(int[] arr) {

        Arrays.sort(arr);
        int diff = arr[1] - arr[0];

      for (int i = 0; i < arr.length; ++i) {
          int diffNext = arr[i + 1] - arr[i];

          if (diff != diffNext)
              return false;
      }
      return true;
    }
}