public class _31p12_doubleLL {
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

    public void addFirst(int data) {
        Node newNode = new Node(data);
        size++;
        if (head == null) {
            head = tail = newNode;
            return;
        }
        newNode.next = head;
        head.prev = newNode;
        head = newNode;
    }

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

    public void removeFirst() {
        if (head == null) {
            System.out.println("DLL is empty");
        }
        if (size == 1) {
            head = tail = null;
            size--;
        }
        head = head.next;
        head.prev = null;
        size--;
    }

    public void removLast() {
        if (head == null) {
            System.out.println("DLL is empty");
        }
        if (size == 1) {
            head = tail = null;
            size--;
        }
        tail = tail.prev;
        tail.next = null;
        size--;
    }

    public void printDll() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " <-> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        _31p12_doubleLL ll = new _31p12_doubleLL();
        ll.addFirst(3);
        ll.addFirst(2);
        ll.addFirst(1);
        ll.addLast(4);
        ll.addLast(5);
        ll.printDll();
        System.out.println(ll.size);
        ll.removeFirst();
        ll.printDll();
        System.out.println(ll.size);
        ll.removLast();
        ll.printDll();
        System.out.println(ll.size);
    }
}