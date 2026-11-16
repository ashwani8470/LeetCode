class Solution {
    public int longestConsecutive(int[] nums) {
        int n = nums.length;

        if (n == 0) {
            return 0;
        }

        Arrays.sort(nums);

        int count = 1;
        int c = 1;

        for (int i = 0; i < n - 1; i++) {

            if (nums[i] == nums[i + 1] - 1) {
                c++;
            }
            else if (nums[i] == nums[i + 1]) {
                continue;
            }
            else {
                count = Math.max(count, c);
                c = 1;
            }
        }

        count = Math.max(count, c);

        return count;
    }
}