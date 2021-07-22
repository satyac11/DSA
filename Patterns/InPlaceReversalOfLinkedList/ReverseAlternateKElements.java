package Patterns.InPlaceReversalOfLinkedList;

public class ReverseAlternateKElements {
    static class ListNode{
        int data;
        ListNode next;
        ListNode(int data){
            this.data = data;
        }
    }

    static ListNode reverse(ListNode head, int k){
        if(k<=1 || head == null)
            return head;
        ListNode prev = null;
        ListNode current = head;

        while(true){
            ListNode next = null;
            ListNode lastNodeOfPart = prev;
            ListNode lastNodeOfSublist = current;

            int i=0;
            while(i<k && current != null){
                next = current.next;
                current.next = prev;
                prev = current;
                current = next;
                i++;
            }

            if(lastNodeOfPart != null)
                lastNodeOfPart.next =prev;
            else
                head = prev;
            lastNodeOfSublist.next = current;

            int j=0;
            while(j<k && current != null){
                prev = current;
                current = current.next;
                j++;
            }
            if(current == null)
                break;


        }
        return head;

    }

    public static void printLinkedList(ListNode head){
        ListNode pointer = head;
        while(pointer != null){
            System.out.println(pointer.data);
            pointer = pointer.next;
        }
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        ListNode node1 = new ListNode(2);
        ListNode node2 = new ListNode(3);
        ListNode node3 = new ListNode(4);
        ListNode node4 = new ListNode(5);
        ListNode node5 = new ListNode(6);
        ListNode node6 = new ListNode(7);
        ListNode node7 = new ListNode(8);

        head.next = node1;
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;
        node5.next = node6;
        node6.next = node7;

        printLinkedList(reverse(head,2));

    }
}
