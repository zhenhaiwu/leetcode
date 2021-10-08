public class LinkedQueue {
    public static void main(String[] args){
        hasCycle(null);
    }

    public static void hasCycle(ListNode head){
        Node node = new Node("hello");
        node.addNode("one");
        node.addNode("two");
        node.addNode("three");
        node.addNode("two");
        node.addNode("three");

        node.deledeNode("two");

        node.printNode();
    }

    class ListNode{
        int val;
        ListNode next;
        ListNode(int x){
            val = x;
            next = null;
        }
    }
}
