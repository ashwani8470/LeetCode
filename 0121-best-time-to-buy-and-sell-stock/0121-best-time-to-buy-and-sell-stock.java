class Solution {
    public int maxProfit(int[] prices) {
     
     //TLE 200/213
     /*
        int n= prices.length;
        int res=0;
        for(int i=0;i<n;i++){
            int a=prices[i];
            for(int j=i+1;j<n;j++){
                int b=prices[j];
                if(b>a){
                    int diff=b-a;
                    res= Math.max(res,diff);
                }
            }
        }
        return res;
        */

        //Method 2
     

        int n = prices.length;
        int minPrice = prices[0];
        int res = 0;

        for (int i = 1; i < n; i++) {
            int profit = prices[i] - minPrice;
            res = Math.max(res, profit);
            minPrice = Math.min(minPrice, prices[i]);
        }

        return res;
    
    }
}