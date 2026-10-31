package Nov2026.Infosys;

public class StockBuyAndSell{

    public int maxProfit(int[] prices){
        
        int minPrice = prices[0];
        int maxPro = 0;

        for(int i=1;i<prices.length;i++){
            maxPro = Math.max(maxPro, prices[i] - minPrice);
            minPrice = Math.min(minPrice, prices[i]);
        }

        return maxPro;

    }

    public static void main(String[] args) {
        int[] prices = {7,1,5,3,6,4};

        StockBuyAndSell obj = new StockBuyAndSell();
        int result = obj.maxProfit(prices);
        System.out.print("Output: "+ result);
    }
}