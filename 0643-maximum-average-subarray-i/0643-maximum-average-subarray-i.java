class Solution {
    public double findMaxAverage(int[] nums, int k) {
        //Approach 1 120/128
        /*
        int n=nums.length;
        double av=0.0;
        if(n==1){
            return (double)nums[0];
        }

        for(int i=0;i<=n-k;i++){
            double a=0.0;
            for(int j=i;j<i+k;j++){
                a+=nums[j];
            }
            a=a/k;
            if(a>av){
                av=a;
            }
        }
        return av;
*/

        int n = nums.length;
        int sum = 0;

        for (int i = 0; i < k; i++) {
            sum += nums[i];
        }

        int maxSum = sum;

        for (int i = k; i < n; i++) {
            sum += nums[i] - nums[i - k];
            maxSum = Math.max(maxSum, sum);
        }

        return (double) maxSum / k;
    
    }
}