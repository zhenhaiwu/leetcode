import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class MyFristSearch {
    public void searchTree() {
        MyTreeNode nodeOne = new MyTreeNode(1);
        MyTreeNode nodeTwo = new MyTreeNode(2);
        MyTreeNode nodeThree = new MyTreeNode(3);
        MyTreeNode nodeFour = new MyTreeNode(4);
        MyTreeNode nodeFive = new MyTreeNode(5);
        MyTreeNode nodeSix = new MyTreeNode(6);
        MyTreeNode nodeSeven = new MyTreeNode(7);

        nodeOne.left = nodeTwo;
        nodeOne.right = nodeThree;
        nodeTwo.left = nodeFour;
        nodeTwo.right = nodeFive;
        nodeThree.left = nodeSix;
        nodeThree.right = nodeSeven;

        System.out.print("广度优先遍历结果：");
        broadFirstSearch(nodeOne);

        System.out.println();

        System.out.print("深度优先遍历结果：");
        deepFirstSearch(nodeOne);
    }

    //广度优先
    public void broadFirstSearch(MyTreeNode root) {
        if (null == root) {
            return;
        }

        Queue<MyTreeNode> myQueue = new LinkedList<>();
        myQueue.add(root);
        while (!myQueue.isEmpty()) {
            MyTreeNode node = myQueue.poll();
            System.out.print(node.value + " ");
            if (null != node.left) {
                myQueue.add(node.left);
            }
            if (null != node.right) {
                myQueue.add(node.right);
            }
        }
    }

    //深度优先
    public void deepFirstSearch(MyTreeNode root) {
        if (null == root) {
            return;
        }

        Stack<MyTreeNode> myStack = new Stack<>();
        myStack.add(root);
        while (!myStack.isEmpty()) {
            MyTreeNode node = myStack.pop();
            System.out.print(node.value + " ");
            if (null != node.right) {
                myStack.add(node.right);
            }
            if (null != node.left) {
                myStack.add(node.left);
            }
        }
    }

    public class MyTreeNode {
        int value;
        MyTreeNode left;
        MyTreeNode right;

        public MyTreeNode(int value) {
            this.value = value;
        }
    }

    class Solution {
        public int search(int[] nums, int target) {
            int low = 0, high = nums.length - 1;
            while (low <= high) {
                int mid = (high - low) / 2 + low;
                int num = nums[mid];
                if (num == target) {
                    return mid;
                } else if (num > target) {
                    high = mid - 1;
                } else {
                    low = mid + 1;
                }
            }
            return -1;
        }
    }

}
