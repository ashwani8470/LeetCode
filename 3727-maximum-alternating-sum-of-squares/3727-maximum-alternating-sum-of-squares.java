import java.util.Arrays;

class Solution {
    public long maxAlternatingSum(int[] nums) {
        int n = nums.length;
        long[] sq = new long[n];
        for (int i = 0; i < n; i++) {
            sq[i] = (long) nums[i] * nums[i];
        }
        Arrays.sort(sq);

        long result = 0;
        for (int i = 0; i < n; i++) {
            result += (i < n / 2) ? -sq[i] : sq[i];
        }
        return result;
    }
}