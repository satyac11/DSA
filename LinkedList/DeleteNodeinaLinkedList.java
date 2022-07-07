package LinkedList;

//Problem Description

/*Write a function to delete a node in a singly-linked list. You will not be given access to the head of the list, instead you will be given access to the node to be deleted directly.

        It is guaranteed that the node to be deleted is not a tail node in the list.



        Example 1:


        Input: head = [4,5,1,9], node = 5
        Output: [4,1,9]
        Explanation: You are given the second node with value 5, the linked list should become 4 -> 1 -> 9 after calling your function.
        Example 2:


        Input: head = [4,5,1,9], node = 1
        Output: [4,5,9]
        Explanation: You are given the third node with value 1, the linked list should become 4 -> 5 -> 9 after calling your function.
        Example 3:

        Input: head = [1,2,3,4], node = 3
        Output: [1,2,4]
        Example 4:

        Input: head = [0,1], node = 0
        Output: [1]
        Example 5:

        Input: head = [-3,5,-99], node = -3
        Output: [5,-99]*/

import java.util.List;

public class DeleteNodeinaLinkedList {


    public static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    public static void deleteNode(ListNode node) {

        if (node.next != null) {
            node.val = node.next.val;
            node.next = node.next.next;
        }

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
        ListNode node1 = new ListNode(-3);
        ListNode node2 = new ListNode(-5);
        ListNode node3 = new ListNode(-99);
        ListNode node4 = new ListNode(4);
        ListNode node5 = new ListNode(5);
        head = node1;
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;
        node5.next = null;

        deleteNode(node2);

        printList(head);

    }
}
