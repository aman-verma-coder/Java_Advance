public class _30p4_addLastInLinkedList {
    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail;

    // Methods
    public void addLast(int data) {
        // Step 1: Create new node
        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;
            return;
        }
        // Step 2: Next=tail;
        tail.next = newNode;// link
        // Step 3: tail=new node
        tail = newNode;
    }

    public static void main(String[] args) {
        _30p4_addLastInLinkedList ll = new _30p4_addLastInLinkedList();
        ll.addLast(1);
        ll.addLast(2);
    }
}