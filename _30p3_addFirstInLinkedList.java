public class _30p3_addFirstInLinkedList {
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
    public void addFirst(int data) {
        // Step 1: Create new node
        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;
            return;
        }
        // Step 2: New node=head;
        newNode.next = head;// link
        // Step 3: head=new node
        head = newNode;
    }

    public static void main(String[] args) {
        _30p3_addFirstInLinkedList ll = new _30p3_addFirstInLinkedList();
        ll.addFirst(1);
        ll.addFirst(2);
    }
}