package Patterns.InPlaceReversalOfLinkedList;

public class ReverseSubList {
    static class ListNode{
        int data;
        ListNode next;
        ListNode(int data){
            this.data = data;
        }
    }

    public static ListNode reverseSubList(ListNode head,int p, int q){
        ListNode prev = null;
        ListNode current =head;
        ListNode next = null;
        while(p>1 && current!=null){
            prev = current;
            current = current.next;
            p--;
        }
        ListNode lastNodeOfFirstPart = prev;
        ListNode lastNodeOfSubList = current;

        int endPosition = q-p+1;
        while(endPosition>0 && current!=null){
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
            endPosition--;
        }

        if(lastNodeOfFirstPart != null)
            lastNodeOfFirstPart.next = prev;
        else
            head = prev;
        lastNodeOfSubList.next = current;

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

        head.next = node1;
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;

        printLinkedList(reverseSubList(head,1,3));

    }
}

