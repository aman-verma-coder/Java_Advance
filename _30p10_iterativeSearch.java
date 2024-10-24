public class _30p10_iterativeSearch {
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

    public static int itSearch(int key) {
        Node temp = head;
        int idx = 0;
        while (temp != null) {
            if (temp.data == key) {
                return idx;
            }
            temp = temp.next;
            idx++;
        }
        return -1;
    }

    public static void main(String[] args) {
        _30p10_iterativeSearch ll = new _30p10_iterativeSearch();
        ll.addLast(1);
        ll.addLast(2);
        ll.addLast(3);
        ll.addLast(5);
        ll.addLast(6);
        System.out.println(itSearch(6));
        System.out.println(itSearch(10));
    }
}