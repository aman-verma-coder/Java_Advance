public class _31p13_reverseADoublyLL {
    public static class Node {
        int data;
        Node next;
        Node prev;

        public Node(int data) {
            this.data = data;
            this.next = null;
            this.prev = null;
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
        newNode.prev = tail;
        tail = newNode;
    }

    public void printDll() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " <-> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public void reverseDLL() {
        Node curr = head;
        Node prev = null;
        Node nxt;
        while (curr != null) {
            nxt = curr.next;
            curr.next = prev;
            curr.prev = nxt;
            prev = curr;
            curr = nxt;
        }
        head = prev;
    }

    public static void main(String[] args) {
        _31p13_reverseADoublyLL dll = new _31p13_reverseADoublyLL();
        dll.addLast(1);
        dll.addLast(2);
        dll.addLast(3);
        dll.addLast(4);
        dll.addLast(5);
        dll.printDll();
        dll.reverseDLL();
        dll.printDll();
    }
}