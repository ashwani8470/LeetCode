class Solution {
    public boolean containsDuplicate(int[] nums) {
       //Approach 1 TLE 70/79
       /*
       int n= nums.length;
       for(int i=0;i<n-1;i++){
        for(int j=i+1;j<n;j++){
            if(nums[i]==nums[j]){
                return true;
            }
        }
       }
       return false;
       */

       // Approach 2
       int n=nums.length;
       Arrays.sort(nums);
       for(int i=0;i<n-1;i++){
        if(nums[i]==nums[i+1]){
            return true;
        }
       }
       return false;
    }
}