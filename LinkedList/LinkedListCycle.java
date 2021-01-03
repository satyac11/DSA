package LinkedList;

public class LinkedListCycle {
    public static class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    public static boolean hasCycle(ListNode head) {
        if (head == null || head.next == null)
            return false;
        ListNode slow = head;
        ListNode fast = head;

        do {
            slow = slow.next;
            if(fast.next != null)
                fast = fast.next.next;
            else
                fast = fast.next;
        }
        while(fast != null &&(slow.val != fast.val));

        if(fast == null)
            return false;
        else
            return true;
    }

    //Excelent Solution
    public static boolean hasCycle1(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        while(fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        ListNode head;
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);
        ListNode node4 = new ListNode(4);
        ListNode node5 = new ListNode(5);

        head = node1;
        node1.next = node2;
        node2.next = node1;
       /* node3.next = node4;
        node4.next = node5;
        node5.next = null;*/

        System.out.println("Has Cycle: "+hasCycle(head));

    }
}
