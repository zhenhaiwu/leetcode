public class Fib {
    public int fib(int num) {
        if(num <2)
            return num;
        int p = 0, q = 1;
        int sum = 0;
        for (int i = 2; i < num; i++) {
            sum = p + q;
            p = q;
            q = sum;
        }
        return sum;
    }
}
