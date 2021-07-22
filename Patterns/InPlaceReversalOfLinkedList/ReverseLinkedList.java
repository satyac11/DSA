package Patterns.InPlaceReversalOfLinkedList;

public class ReverseLinkedList {
    static class ListNode{
        int data;
        ListNode next;
        ListNode(int data){
            this.data = data;
        }
    }

    public static ListNode reverseLinkedList(ListNode head){
        ListNode prev = null;
        ListNode next = null;
        ListNode current = head;
        while(current!=null){
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        return prev;
    }

    public static void printLinkedList(ListNode head){
        ListNode pointer = head;
        while(pointer != null){
            System.out.println(pointer.data);
            pointer = pointer.next;
        }
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(0);
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);
        ListNode node4 = new ListNode(4);
        ListNode node5 = new ListNode(5);

        head.next = node1;
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;

        printLinkedList(reverseLinkedList(head));

    }
}
