import java.util.HashMap;

/*
输入：nums = [2,7,11,15], target = 9
输出：[0,1]
解释：因为 nums[0] + nums[1] == 9 ，返回 [0, 1] 。
* */
public class twoSum {
    public void result () {
        int target = 20;
        int[] nums = {2, 7, 11, 15, 6, 8, 9};
        HashMap<Integer,Integer> hashtable = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            if(hashtable.containsKey(target - nums[i])) {
                System.out.println(hashtable.get(target-nums[i]) + " " + i);
            }
            hashtable.put(nums[i],i);
        }
    }

}
