package LinkedList;

import java.util.List;

public class ReverseLinkedList {

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

    public static ListNode reverse(ListNode head) {
        ListNode p = head;
        ListNode q = null;
        ListNode r = null;

        while (p != null) {
            r = q;
            q = p;
            p = p.next;
            q.next = r;
        }
        return q;
    }

    public static ListNode reverseRecursion(ListNode head){
        if(head == null)
            return null;
        return reverseList(null,head);
    }
    static ListNode reverseHead = null;
    public static ListNode reverseList(ListNode q, ListNode p){
        if(p != null){
            reverseList(p,p.next);
            p.next = q;
        }
        else
            reverseHead = q;

        return reverseHead;

    }

    static void printList(ListNode head) {
        ListNode pointer = head;
        while (pointer != null) {
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
        //head = reverse(head);
        head = reverseRecursion(head);
        printList(head);
    }
}
