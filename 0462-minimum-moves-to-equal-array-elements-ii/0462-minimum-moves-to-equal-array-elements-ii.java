/*class Solution {
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
*/


import java.util.Arrays;

class Solution {
    public int minMoves2(int[] nums) {
        Arrays.sort(nums);

        int n = nums.length;
        int median = nums[n / 2];
        int moves = 0;

        for (int i = 0; i < n; i++) {
            moves += Math.abs(nums[i] - median);
        }

        return moves;
    }
}
