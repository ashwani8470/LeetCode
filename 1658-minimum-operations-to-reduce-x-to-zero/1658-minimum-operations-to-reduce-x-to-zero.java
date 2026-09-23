//Approach 1 4/97
/*

class Solution {
    public int minOperations(int[] nums, int x) {
      int n=nums.length;
      int num=x;
      int i=0;
      int j=n-1;
      if(nums[0]>x){
        return -1;
      }
      if(nums[n-1]>x){
        return -1;
      }
      int count=0;
      while(i<j){
        if(nums[i]>nums[j] && num-nums[i]>=0){
            num=num-nums[i];
            i++;
            count++;
        }
        else{
            num=num-nums[j];
            j--;
            count++;
        }
      }  
      return count;
    }
}*/

//Approach 2
class Solution {
    public int minOperations(int[] nums, int x) {
        int n = nums.length;
        int total = 0;

        for (int num : nums) {
            total += num;
        }

        int target = total - x;

        if (target < 0) {
            return -1;
        }

        if (target == 0) {
            return n;
        }

        int left = 0;
        int sum = 0;
        int maxLen = -1;

        for (int right = 0; right < n; right++) {
            sum += nums[right];

            while (sum > target && left <= right) {
                sum -= nums[left++];
            }

            if (sum == target) {
                maxLen = Math.max(maxLen, right - left + 1);
            }
        }

        return maxLen == -1 ? -1 : n - maxLen;
    }
}