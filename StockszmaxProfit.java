public class StockszmaxProfit {
    public static int profitmax(int stocks[])
    {
        int buy_price = Integer.MAX_VALUE;
        int max_profit = 0,profit;
        for (int i = 0; i < stocks.length; i++)
        {
            if(buy_price<stocks[i])
            {
                profit = stocks[i] - buy_price;
                max_profit = Math.max(max_profit, profit);
            }
            else
            {
                buy_price = stocks[i];
            }
        }
        return max_profit;
    }
    public static void main(String args[])
    {
       int stocks[] = new int []{7, 1, 5, 3, 6, 4};
       int max_profit = profitmax(stocks);
       System.out.println("The max profit is  "+max_profit);
    }
}
