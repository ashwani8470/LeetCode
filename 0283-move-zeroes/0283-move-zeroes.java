class Solution {
    public void moveZeroes(int[] nums) {
        //Method 1 beats 5% in run time and 99 % in space
        /*
        int n= nums.length;
        for(int i=0;i<n;i++){
            if(nums[i]==0){
                for(int j=i+1;j<n;j++){
                    if(nums[j]!=0){
                        int temp=nums[i];
                        nums[i]=nums[j];
                        nums[j]=temp;
                        break;
                    }
                }
            }
        }*/

        //Method 2
         

        int j = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                j++;
            }
        }
    
    }
}