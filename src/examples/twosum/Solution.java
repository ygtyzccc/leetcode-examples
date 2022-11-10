package twosum;

class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int leftIndex = 0;
        int rightIndex = numbers.length - 1;

        while (leftIndex <= rightIndex){

            if (numbers[leftIndex] + numbers[rightIndex] < target)
                --rightIndex;

            else if (numbers[leftIndex] + numbers[rightIndex] > target)
                ++leftIndex;

            else
                return new int[] {leftIndex + 1, rightIndex + 1};

        }
        return null;
    }
}