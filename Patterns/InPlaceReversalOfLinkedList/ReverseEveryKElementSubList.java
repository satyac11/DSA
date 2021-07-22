package Patterns.InPlaceReversalOfLinkedList;

public class ReverseEveryKElementSubList {
    static class ListNode{
        int data;
        ListNode next;
        ListNode(int data){
            this.data = data;
        }
    }

    static ListNode reverseKElements(ListNode head, int k){
        if(k<=1 || head == null)
            return head;
        ListNode prev = null;
        ListNode current = head;
        while(true){
            ListNode lastNodeOfPart = prev;
            ListNode lastNodeOfSubList = current;

            ListNode next = null;
            int i=0;
            while(i<k && current!=null){
                next = current.next;
                current.next = prev;
                prev = current;
                current = next;
                i++;
            }

            if(lastNodeOfPart !=null)
                lastNodeOfPart.next = prev;
            else
                head = prev;
            lastNodeOfSubList.next = current;
            if(current == null)
                break;
            prev = lastNodeOfSubList;
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

        printLinkedList(reverseKElements(head,3));

    }
}
