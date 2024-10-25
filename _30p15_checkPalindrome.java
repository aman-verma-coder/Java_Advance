public class _30p15_checkPalindrome {
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

    public Node findMid(Node head) {// helper
        Node slow = head;
        Node fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;// +1
            fast = fast.next.next;// +2
        }
        return slow;// slow will be middle Node
    }

    public boolean checkPalindrome() {
        if (head == null || head.next == null) {
            return true;
        }
        // step-1: Find Mid
        Node mid = findMid(head);
        // step-2: Reverse 2nd half
        Node prev = null;
        Node curr = mid;
        Node nxt;
        while (curr != null) {
            nxt = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nxt;
        }
        Node left = head;// left half head
        Node right = prev;// right half head
        // step-3: Check left half and right half
        while (right != null) {
            if (left.data != right.data) {
                return false;
            }
            left = left.next;
            right = right.next;
        }
        return true;
    }

    public static void main(String[] args) {
        _30p15_checkPalindrome ll = new _30p15_checkPalindrome();
        ll.addLast(1);
        ll.addLast(2);
        // ll.addLast(3);
        ll.addLast(2);
        ll.addLast(1);
        ll.printLL();
        System.out.println(ll.checkPalindrome());
    }
}