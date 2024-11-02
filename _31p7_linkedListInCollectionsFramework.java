import java.util.LinkedList;

public class _31p7_linkedListInCollectionsFramework {
    public static void main(String[] args) {
        // Create a new linked list(Data type will be in Object Form)
        LinkedList<Integer> ll = new LinkedList<>();
        // Add
        ll.addLast(2);
        ll.addLast(3);
        ll.addFirst(1);
        ll.addFirst(0);
        System.out.println(ll);
        // Remove
        ll.removeLast();
        ll.removeFirst();
        System.out.println(ll);
    }
}