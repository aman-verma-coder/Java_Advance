public class _31p4_removeCycle {
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

    public static boolean isCyclic() {// Floyd's Cycle Finding Algorithm
        Node slow = head;
        Node fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;// +1
            fast = fast.next.next;// +2
            if (slow == fast) {
                return true;// cycle exists
            }
        }
        return false;// cycle does not exist
    }

    public static void removeCycle() {
        Node slow = head;
        Node fast = head;
        boolean cyex = false;
        while (fast != null && fast.next != null) {
            slow = slow.next;// +1
            fast = fast.next.next;// +2
            if (slow == fast) {
                cyex = true;// cycle exists
                break;
            }
        }
        if (cyex == false) {
            return;
        }
        slow = head;
        Node prev = null;
        while (slow != fast) {
            prev = fast;
            slow = slow.next;
            fast = fast.next;
        }
        prev.next = null;// cycle removed
    }

    public static void main(String[] args) {
        _31p4_removeCycle ll = new _31p4_removeCycle();
        head = new Node(1);
        Node temp = new Node(2);
        head.next = temp;
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = temp;
        System.out.println(ll.isCyclic());
        removeCycle();
        System.out.println(ll.isCyclic());
    }
}