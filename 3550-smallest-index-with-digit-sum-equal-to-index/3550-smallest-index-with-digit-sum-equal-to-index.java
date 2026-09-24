class Solution {
    private int sum(int num){
        int s=0;
        while(num!=0){
            int d=num%10;
            s+=d;
            num=num/10;
        }
        return s;
    }
    public int smallestIndex(int[] nums) {
        int n=nums.length;
        for(int i=0;i<n;i++){
            if(nums[i]/10==0){
                if(nums[i]==i){
                    return i;
                }
            }
            else{
                int ans=sum(nums[i]);
                if(ans==i){
                    return i;
                }
            }
        }
        return -1;
    }
}