public class _30p6_addInTheMiddleOfTheLinkedList {
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

    public void addLast(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;
            return;
        }
        tail.next = newNode;
        tail = newNode;
    }

    public void addInTheMiddle(int data, int idx) {
        if (idx == 0) {
            addFirst(data);
        }
        Node newNode = new Node(data);
        Node temp = head;
        int i = 0;
        while (i < idx - 1) {
            temp = temp.next;
            i++;
        }
        if (i == idx - 1) {
            newNode.next = temp.next;
            temp.next = newNode;
        }
    }

    public void printLL() {
        Node temp = head;
        if (head == null) {
            System.out.println("LL is empty");
            return;
        }
        while (temp != null) {
            System.out.print(temp.data + "=>");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        _30p6_addInTheMiddleOfTheLinkedList ll = new _30p6_addInTheMiddleOfTheLinkedList();
        ll.addLast(1);
        ll.addLast(2);
        ll.addLast(3);
        ll.addLast(5);
        ll.addLast(6);
        ll.printLL();
        ll.addInTheMiddle(4, 3);
        ll.printLL();
    }
}