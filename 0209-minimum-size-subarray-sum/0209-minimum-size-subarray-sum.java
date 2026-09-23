//Approach 1 11/25
/*
class Solution {
    public int minSubArrayLen(int target, int[] nums) {
      Arrays.sort(nums);
      int n=nums.length;
      int count=0;
      int sum=0;
      for(int i=n-1;i>=0;i--){
        if(sum==target){
            break;
        }
        sum=sum+nums[i];
        count++;
      }
      if(sum!=target){
        return 0;
      }
      return count;  
    }
    
}*/

//Approach 2
class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int n = nums.length;
        int left = 0;
        int sum = 0;
        int minLen = Integer.MAX_VALUE;

        for (int right = 0; right < n; right++) {
            sum += nums[right];

            while (sum >= target) {
                minLen = Math.min(minLen, right - left + 1);
                sum -= nums[left];
                left++;
            }
        }

        return minLen == Integer.MAX_VALUE ? 0 : minLen;
    }
}