public class MaxProfit {
    /*---------------------一次买入卖出----------------------------*/
    //暴力解法
    public void maxPro(int[] price) {
        int maxPrice = 0;
        int length = price.length;
        for (int i = 0; i < length - 1; i++) {
            for (int j = i + 1; j < length - 1; j++) {
                maxPrice = Math.max(maxPrice, price[j] - price[i]);
            }
        }
        System.out.println("max price is " + maxPrice);
    }

    //贪心算法
    public void maxPro2(int[] price) {
        int maxPrice = 0;
        int low = Integer.MAX_VALUE;
        int length = price.length;
        for (int i = 0; i < length - 1; i++) {
            low = Math.min(price[i], low);
            maxPrice = Math.max(maxPrice, price[i] - low);
            System.out.println("low is " + low + ",maxPrice is " + maxPrice);
        }

        System.out.println("max2 price is " + maxPrice);
    }

    //动态规划
    public void maxPrx3(int[] price) {
        int length = price.length;
        if (length == 0)
            System.out.println("0");
        int dp[][] = new int[length][2];
        dp[0][0] = -price[0];
        dp[0][1] = 0;
        for (int i = 1; i < length; i++) {
            dp[i][0] = Math.max(dp[i - 1][0], -price[i]);
            dp[i][1] = Math.max(dp[i - 1][1], dp[i - 1][0] + price[i]);
        }
        System.out.println("max3 price is " + dp[length - 1][1]);
    }

    /*---------------------多次买入卖出----------------------------*/
    public void maxPro4(int[] price) {
        int length = price.length;
        if (length == 0)
            System.out.println("0");
        int dp[][] = new int[length][2];
        dp[0][0] = -price[0];
        dp[0][1] = 0;
        for (int i = 1; i < length; i++) {
            dp[i][0] = Math.max(dp[i - 1][0], dp[i - 1][1] - price[i]);
            dp[i][1] = Math.max(dp[i - 1][1], dp[i - 1][0] + price[i]);
        }
        System.out.println("max4 price is " + dp[length - 1][1]);
    }

    /*---------------------最多2次买入卖出----------------------------*/
    /*
    * dp[i][0] 没有操作
    * dp[i][1] 第一次买入
    * dp[i][2] 第一次卖出
    * dp[i][3] 第二次买入
    * dp[i][4] 第二次卖出
    * */
    public void maxPro5(int[] price) {
        int length = price.length;
        if(length == 0)
            System.out.println("0");
        int dp[][] = new int[length][5];
        dp[0][0] = 0;
        dp[0][1] = -price[0];
        for (int i = 1; i < length; i++) {
            dp[i][0] = dp[i-1][0];
            dp[i][1] = Math.max(dp[i-1][1],dp[i-1][0]-price[i]);
        }

    }
}
