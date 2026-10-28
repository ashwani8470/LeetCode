class Solution {
    public int maxArea(int[] height) {
        int n=height.length;
        int i=0;
        int j=n-1;

        int sum=0;
        int s=0;
        while(i<j){
            if(height[i]>=height[j]){
                s=height[j]*(j-i);
                j--;
            }
            else{
                s=height[i]*(j-i);
                i++;
            }
            if(s>sum){
                sum=s;
            }
        }
        return sum;
    }
}