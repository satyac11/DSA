package LinkedList;

import java.util.List;

public class RemoveNthNodeFromEndofList {

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

    public static ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;

       ListNode first = dummy;
       ListNode second=dummy;

       for(int i=0;i<=n;i++)
           first = first.next;

       while(first !=null){
           first = first.next;
           second = second.next;

       }

       second.next = second.next.next;

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
        node2.next = null;
        //node3.next = node4;
        //node4.next = node5;
        //node5.next = null;

        head = removeNthFromEnd(head,1);
        printList(head);
    }
}
