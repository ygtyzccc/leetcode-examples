package palindromenumber;

class Solution {
    public boolean isPalindrome(int x) {
        if (x == 0)
            return true;

        if (x < 0 || x % 10 == 0)
            return false;

        if (reversedNum(x) == x)
            return true;

        return false;

        }


    public int reversedNum(int val){
        int reversed = 0;
        while (val != 0) {
            int lastDigit = val % 10;
            val /= 10;

            reversed = (10 * reversed) + lastDigit;

        }

        return reversed;
    }
}