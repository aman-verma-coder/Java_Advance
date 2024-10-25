public class _30p13_findfAndRemoveNthNodeFromEnd {
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
    public static int size;

    public void addLast(int data) {
        Node newNode = new Node(data);
        size++;
        if (head == null) {
            head = tail = newNode;
            return;
        }
        tail.next = newNode;
        tail = newNode;
    }

    public void printLL() {
        Node temp = head;
        if (head == null) {
            System.out.println("LL is empty");
            return;
        }
        while (temp != null) {
            System.out.print(temp.data + " => ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public void removeNthFromEnd(int n) {
        if (n==size) {
            head=head.next;
        }
        int idx = 0;
        Node temp = head;
        while (idx < size - n - 1) {
            idx++;
            temp = temp.next;
        }
        Node dummy = temp.next;
        dummy = dummy.next;
        if (idx == size - n - 1) {
            temp.next = dummy;
        }
    }

    public static void main(String[] args) {
        _30p13_findfAndRemoveNthNodeFromEnd ll = new _30p13_findfAndRemoveNthNodeFromEnd();
        ll.addLast(1);
        ll.addLast(2);
        ll.addLast(3);
        ll.addLast(4);
        ll.addLast(5);
        ll.addLast(6);
        ll.printLL();
        ll.removeNthFromEnd(2);
        ll.printLL();
    }
}