package Patterns.Fast_SlowPointers;

public class RearrangeLinkedList {
    static class ListNode{
        int data;
        ListNode next;
        ListNode(int value){
            data = value;
        }
    }

    static ListNode reArrange(ListNode head){
        ListNode slow = head;
        ListNode fast = head;
        while(fast !=null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        ListNode second = reverse(slow);
         ListNode first = head;
        ListNode result = first;
        while( second!=null && first!= second){
            ListNode temp1 = first;
            first = first.next;
            temp1.next = second;

            ListNode temp2 = second;
            second = second.next;
            temp2.next = first;
        }
        if(first.data==slow.data)
            first.next =null;
        return result;
    }

    static ListNode reverse(ListNode head){
        ListNode prev = null;
        ListNode current = null;
        ListNode nextNode = head;
        while(nextNode != null){
            prev = current;
            current = nextNode;
            nextNode = nextNode.next;
            current.next = prev;
        }
        return current;
    }

    static void printList(ListNode head){
        ListNode node = head;
        while(node !=null){
            System.out.println(node.data);
            node = node.next;
        }
    }

    public static void main(String[] args) {
       /* ListNode head = new ListNode(1);
        ListNode node1 = new ListNode(2);
        ListNode node2 = new ListNode(3);
        ListNode node3 = new ListNode(4);
        ListNode node4 = new ListNode(5);
        ListNode node5 = new ListNode(6);*/

        ListNode head = new ListNode(2);
        ListNode node1 = new ListNode(4);
        ListNode node2 = new ListNode(6);
        ListNode node3 = new ListNode(8);
        ListNode node4 = new ListNode(10);
        //ListNode node5 = new ListNode(12);

        head.next = node1;
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
       // node4.next = node5;

        printList(reArrange(head));

    }
}
