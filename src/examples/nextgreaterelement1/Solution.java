package nextgreaterelement1;

public class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {

        int[] result = new int[nums1.length];
        int sameIndex;

        for (int i = 0; i < nums1.length; ++i) {  //nums1 = [4,1,2], nums2 = [1,3,4,2]
            EXIT_LOOP:
            for (int j = 0; j < nums2.length; ++j) {
                if (nums1[i] == nums2[j]) {
                    sameIndex = j;

                    if (j == nums2.length - 1)
                        result[i] = -1;

                    for (int k = sameIndex + 1; k < nums2.length; ++k) {
                        if (nums1[i] < nums2[k]) {
                            result[i] = nums2[k];
                            break EXIT_LOOP;
                        }
                    }
                    result[i] = -1;
                }


            }
        }

        return result;
    }
}
