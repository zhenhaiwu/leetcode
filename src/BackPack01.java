public class BackPack01 {
    int N = 6;
    int W = 21;
    int weight[] = {0, 2, 3, 4, 5, 9};
    int value[] = {0, 3, 4, 5, 8, 10};

    public void getValue() {
        int sum[][] = new int[N][W];

        for (int i = 1; i < N; i++) {
            for (int j = 1; j < W; j++) {
                if (weight[i] > j) {
                    sum[i][j] = sum[i - 1][j];
                } else {
                    sum[i][j] = Math.max(sum[i - 1][j], sum[i - 1][j - weight[i]] + value[i]);
                }
            }
        }
        System.out.println(sum[5][20]);
    }

    public void getValue2() {
        int sum[] = new int[W];

        for (int i = 1; i < N; i++) {
            for (int j = W - 1; j >= weight[i]; j--) {
                sum[j] = Math.max(sum[j], sum[j - weight[i]] + value[i]);
            }

        }
        System.out.println(sum[20]);
    }
}
