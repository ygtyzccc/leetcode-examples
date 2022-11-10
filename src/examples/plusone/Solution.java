package plusone;

class Solution {
    public int[] plusOne(int[] digits) {
        int pointer = digits.length - 1;

        if (digits.length == 1 && digits[pointer] == 9)
            return new int [] {1, 0};

        else if (digits[pointer] != 9){
            ++digits[pointer];
            return digits;
        }

        else {
            digits[pointer] = 0;
            ++digits[pointer - 1];
            --pointer;

            while (pointer > 0 && digits[pointer] == 10) {
                digits[pointer] = 0;
                ++digits[pointer - 1];
                --pointer;

                if (pointer == 0 && digits[pointer] == 10) {

                    digits[pointer] = 0;
                    int[] result = new int[digits.length + 1];

                    result[0] = 1;

                    for (int i = 1; i < digits.length + 1; ++i)
                        result[i] = digits[i - 1];

                    return result;
                }

            }
            return digits;

        }
    }
}