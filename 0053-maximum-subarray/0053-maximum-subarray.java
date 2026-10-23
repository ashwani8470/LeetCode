/*
class Solution {
    public int maxSubArray(int[] nums) {
        int curr = nums[0];
        int maxs = nums[0];

        for (int i = 1; i < nums.length; i++) {
            curr = Math.max(nums[i], curr + nums[i]);
            maxs = Math.max(maxs, curr);
        }

        return maxs;
    }
}*/



class Solution {
    public int maxSubArray(int[] nums) {
        int n = nums.length;
        int[] prefix = new int[n];

        int sum = 0;
        for (int i = n - 1; i >= 0; i--) {
            sum += nums[i];
            prefix[i] = sum;
        }

        int maxs = nums[0];
        int curr = nums[0];

        for (int i = 1; i < n; i++) {
            curr = Math.max(nums[i], curr + nums[i]);
            maxs = Math.max(maxs, curr);
        }

        return maxs;
    }
}

