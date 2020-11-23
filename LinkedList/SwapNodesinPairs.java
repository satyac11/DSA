package LinkedList;

public class SwapNodesinPairs {

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

    public static ListNode swapPairs(ListNode head) {
        if(head == null || head.next==null)
            return head;
        ListNode dummy = new ListNode(0);
        ListNode current = dummy;
        dummy.next = head;

        while(current.next !=null && current.next.next !=null){
            ListNode slow = current.next;
            ListNode fast = current.next.next;

            slow.next = fast.next;
            current.next = fast;
            fast.next = slow;
            current = slow;
        }
        return dummy.next;

    }



    static void printList(ListNode head){
        ListNode pointer = head;
        while(pointer != null){
            System.out.println(pointer.val);
            pointer = pointer.next;
        }
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
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;
        node5.next = null;
        ListNode reverse =swapPairs(head);
        printList(reverse);


    }
}
