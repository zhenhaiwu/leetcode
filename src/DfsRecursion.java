/*递归dfs*/
public class DfsRecursion {
    private static class Node{
        public int value;
        public Node left;
        public Node right;

        public Node(int value,Node left,Node right){
            this.value = value;
            this.left = left;
            this.right =right;
        }
    }

    public static void dfs(Node treeNode){
        if(treeNode == null){
            return;
        }
        System.out.println("value is "+treeNode.value);

        dfs(treeNode.left);
        dfs(treeNode.right);
    }
}
