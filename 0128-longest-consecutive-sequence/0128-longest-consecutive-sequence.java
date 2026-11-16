//Approach 1 = O(nlogn)
/*
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
}*/

import java.util.*;

class Solution {
    public int longestConsecutive(int[] nums) {

        HashSet<Integer> set = new HashSet<>();

        for (int num : nums) {
            set.add(num);
        }

        int maxCount = 0;

        for (int num : set) {

            // Check whether num is the starting point
            if (!set.contains(num - 1)) {

                int count = 1;
                int current = num;

                while (set.contains(current + 1)) {
                    current++;
                    count++;
                }

                maxCount = Math.max(maxCount, count);
            }
        }

        return maxCount;
    }
}