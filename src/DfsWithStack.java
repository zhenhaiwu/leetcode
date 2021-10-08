import java.util.Stack;

//栈实现dfs
public class DfsWithStack {
    public static void dfsWithStack(Node root){
        if(root == null) {
            return;
        }

        Stack<Node>stack = new Stack<>();
        //根节点压栈
        stack.push(root);
        while (!stack.isEmpty()){
            Node treeNode = stack.pop();
            //遍历节点
            System.out.println(treeNode);

            //先压右节点
            if(treeNode.right != null){
                stack.push(treeNode.right);
            }
            //再压左节点
            if(treeNode.left != null) {
                stack.push(treeNode.left);
            }

        }
    }

    private  static class Node{
        public int value;
        public Node left;
        public Node right;

        public Node(int value,Node left,Node right){
            this.value = value;
            this.left = left;
            this.right = right;
        }
    }
}
