package LinkedList;

public class RemoveNthNodeFromEnd {
    static class ListNode{
        int val;
        ListNode next;
        ListNode(int val){
            this.val = val;
        }
    }
    public static ListNode removeNthFromEnd(ListNode head,int n){
        ListNode dummy =new ListNode(0);
        dummy.next = head;
        ListNode slow=dummy;
        ListNode fast=dummy;

        for(int i=0;i<=n;i++){
            fast = fast.next;
        }
        while(fast !=null){
            fast = fast.next;
            slow = slow.next;
        }
        slow.next = slow.next.next;
        return dummy.next;
    }

    public static void printLinkedList(ListNode head){
        while(head !=null){
            System.out.print(head.val);
            head =head.next;
        }
    }
    public static void main(String[] args) {
        ListNode head;
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);
        ListNode node4 = new ListNode(4);

        head = node1;
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = null;
        head = removeNthFromEnd(head,4);
        printLinkedList(head);

    }
}
