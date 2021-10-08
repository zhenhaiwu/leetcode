import java.util.PriorityQueue;

public class LargestElement {
    PriorityQueue<Integer> q;
    int k;

    public void  KthLargetest(int k, int[] a){
        this.k = k;
        q = new PriorityQueue<>(k);
    }

}
