class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int n= numbers.length;
        int [] ans= new int [2];
        int i=0;
        int j=n-1;
        ans[0]=i+1;
        ans[1]=j+1;
        int sum=0;
        while(i<j){
            sum=numbers[i]+numbers[j];
            if(sum>target){
                j--;
            }
            else if(sum==target){
                break;
            }
            else{
                i++;
            }
        }
        ans[0]=i+1;
        ans[1]=j+1;
        return ans;

    }
}