class Solution {
    public int minMoves2(int[] nums) {
     int n= nums.length;
     Arrays.sort(nums);
     int sum=0;
     for(int i=0;i<n;i++){
        if(i==n/2){
            continue;
        }
        else if(i<n/2){
            sum=sum+(nums[n/2]-nums[i]);
        }
         else if(i>n/2){
            sum=sum+(nums[i]-nums[n/2]);
        }
     }   
     return sum;
    }
}