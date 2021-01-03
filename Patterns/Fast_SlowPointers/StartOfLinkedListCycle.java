package Patterns.Fast_SlowPointers;

public class StartOfLinkedListCycle {
    static class ListNode{
        ListNode next;
        int data;
        ListNode(int value){
            data = value;
        }
    }

    static ListNode findStartingNodeOfCycle(ListNode head){
        ListNode temp = new ListNode(0);
        ListNode pointer = head;
        while(pointer!=null){
            if(pointer.next == temp)
                return pointer;
            ListNode node = pointer;
            pointer = pointer.next;
            node.next = temp;

        }
        return null;
    }

    static ListNode findStartingNodeOfCycle2(ListNode head){
        ListNode slow = head;
        ListNode fast = head;
        while(fast != null && fast.next !=null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast){
                return firstNode(head,fast);
            }
        }
        return null;
    }
    static ListNode firstNode(ListNode slow,ListNode fast){
        while(fast != null && fast.next != null){
            if(slow == fast)
                return slow;
            slow = slow.next;
            fast = fast.next;
        }
    return null;
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
        node5.next = node1;

        System.out.println("Has Cycle: "+findStartingNodeOfCycle(head).data);
        System.out.println("Has Cycle: "+findStartingNodeOfCycle2(head).data);
    }

}
