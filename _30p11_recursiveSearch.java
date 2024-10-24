public class _30p11_recursiveSearch {
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

    public static int helper(Node head, int key) {
        if (head == null) {
            return -1;
        }
        if (head.data == key) {
            return 0;
        }
        int idx = helper(head.next, key);
        if (idx == -1) {
            return idx;
        }
        return idx + 1;
    }

    public static int recSearch(int key) {
        return helper(head, key);
    }

    public static void main(String[] args) {
        _30p11_recursiveSearch ll = new _30p11_recursiveSearch();
        ll.addLast(1);
        ll.addLast(2);
        ll.addLast(3);
        ll.addLast(5);
        ll.addLast(6);
        System.out.println(recSearch(6));
        System.out.println(recSearch(10));
    }
}