import java.util.Arrays;

class Solution {
    public int maxProfit(int[] prices) {
        int min = prices[0];
        int pos = 0;
        for(int i=0;i<prices.length - 1;i++){
            if(prices[i] < min){
                min = prices[i];
                pos = i;
            }
        }
        int max = prices[pos];
        for(int i = pos;i<prices.length;i++){
            if(prices[i] >= max){
                max = prices[i];
                pos = i;
            }else{
                break;
            }
        }
        return pos+1;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        int[] a = new int[]{7,6,4,3,1};
        int ans = s.maxProfit(a);
        System.out.println(ans);
    }
}