public class Solution {
    public static void main(String[] args) {
        int[] arr = { 1, 1, 0 };
        System.out.println(findMaxConsecutiveOnes(arr));
    }

    public static int findMaxConsecutiveOnes(int[] nums) {
        int len = nums.length;

        int maxi = 0;
        int count = 0;
        for (int i = 0; i < len; i++) {

            if (nums[i] == 1) {
                ++count;
            } else {
                count = 0;
            }
            if (maxi < count) {
                maxi = count;
            }
        }
        return maxi;
    }
}
