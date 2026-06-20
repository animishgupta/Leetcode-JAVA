class Solution {
    public int maxProfit(int[] prices) {
        int n=Integer.MAX_VALUE;
        int m=0;
        for(int i=0;i<prices.length;i++){
            int price= prices[i];
            if(price<n){
                n=price;
            }
            else if(price-n>m){
                m=price-n;
            }
        }
        return m;

         
        
    }
}