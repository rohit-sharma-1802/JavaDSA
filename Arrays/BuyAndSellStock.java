public class BuyAndSellStock {
    public static int maxProfit(int prices[]) {
        int maxProfit = 0;
        int buyPrice = Integer.MAX_VALUE;
        int n = prices.length;

        for (int i = 0; i < n; i++) {
            if (buyPrice > prices[i]) {
                buyPrice = prices[i];
            } else {
                maxProfit = Math.max(maxProfit, prices[i] - buyPrice);
            }
        }
        return maxProfit;

    }

    public static void main(String[] args) {
        int prices[] = { 7, 1, 5, 3, 6, 4 };
        System.out.println(maxProfit(prices));
    }
}
