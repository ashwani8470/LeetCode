class Solution {
    public int majorityElement(int[] nums) {
       //Approach 1 TLe 56/58
       /*
       int n=nums.length;
    int ans=nums[0];
    int count=0;
       for(int i=0;i<n-1;i++){
        int c=1;
        for(int k=i+1;k<n;k++){
            if(nums[i]==nums[k]){
                c++;
            }
        }
        if(c>count){
            count=c;
            ans=nums[i];
        }
       }
       return ans;
*/
 
        int ans = nums[0];
        int count = 0;

        for (int num : nums) {
            if (count == 0) {
                ans = num;
            }

            if (num == ans) {
                count++;
            } else {
                count--;
            }
        }

        return ans;
    

    }
}