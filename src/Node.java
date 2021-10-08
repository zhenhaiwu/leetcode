
public class Node {
    private String name;
    private Node next;

    public Node(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void addNode(String name) {
        if (this.next == null) {
            this.next = new Node(name);
        } else {
            this.next.addNode(name);
        }
    }

    public void deledeNode(String name) {
        if (this.next != null) {
            if (this.next.name.equals(name)) {
                this.next = this.next.next;
                this.next.deledeNode(name);
            } else {
                this.next.deledeNode(name);
            }
        }
    }


    public void printNode() {
        System.out.println(this.name);
        if (this.next != null) {
            this.next.printNode();
        }
    }
}
