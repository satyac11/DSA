package Patterns.Fast_SlowPointers;

import java.util.List;

public class Palindrome {
    static class ListNode{
        int data;
        ListNode next;
        ListNode(int value){
            data = value;
        }
    }

    static boolean isPalindrome(ListNode head){
        ListNode slow = head;
        ListNode fast = head;
        while(fast != null && fast.next !=null){
            slow= slow.next;
            fast = fast.next.next;
        }
        slow = reverse(slow);
        fast = head;
        while(slow!=null){
            if(fast.data != slow.data)
                return false;
            slow = slow.next;
            fast = fast.next;
        }
        return true;
    }

    static ListNode reverse(ListNode head){
        ListNode previous = null;
        ListNode current = null;
        ListNode nextNode = head;
        while(nextNode != null){
            previous = current;
            current = nextNode;
            nextNode = nextNode.next;
            current.next = previous;
        }
        return current;
    }
    static void printList(ListNode head){
        ListNode pointer = head;
        while(pointer!= null){
            System.out.println(pointer.data);
            pointer = pointer.next;
        }
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(2);
        ListNode node1 = new ListNode(4);
        ListNode node2 = new ListNode(6);
        ListNode node3 = new ListNode(4);
        ListNode node4 = new ListNode(2);
        //ListNode node5 = new ListNode(6);

        head.next = node1;
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        //node4.next = node5;

        //printList(reverse(head));
        System.out.println("Is Palindrome: "+isPalindrome(head));
    }

}
