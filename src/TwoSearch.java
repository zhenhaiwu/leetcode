public class TwoSearch {
    public void search() {
        int[] num = {2, 3, 4, 7, 9, 14, 21, 41, 53, 55, 67, 78};
        int target = 9;

        int low = 0, high = num.length - 1;

        while (low < high) {
            int mid = (high - low) / 2 + low;
            if (num[mid] == target) {
                System.out.print("target is " + num[mid] + " index is " + mid);
                return;
            }else if (mid < target){
                low = mid + 1;
            }else{
                high = mid - 1;
            }
        }
        System.out.print("no target");
    }
}
