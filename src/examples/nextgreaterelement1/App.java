package nextgreaterelement1;

public class App {
    public static void main(String[] args) {
        int [] nums1 = {4, 1, 2};
        int [] nums2 = {1, 3, 4, 2};

        Solution solution = new Solution();

        for (var i: solution.nextGreaterElement(nums1, nums2))
            System.out.printf("%d ", i);
    }
}
