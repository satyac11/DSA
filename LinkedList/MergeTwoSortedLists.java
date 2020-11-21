package LinkedList;

import java.util.List;

public class MergeTwoSortedLists {

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

    public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode l3 = new ListNode(0);
        ListNode merge = l3;

        while (l1 != null && l2 != null) {
            if (l1.val == l2.val) {
                ListNode node1 = new ListNode(l1.val);
                ListNode node2 = new ListNode(l2.val);
                node1.next = node2;

                l3.next = node1;
                l3 = l3.next.next;


                l1 = l1.next;
                l2 = l2.next;

            } else if (l1.val < l2.val) {
                ListNode node = new ListNode(l1.val);
                l3.next = node;
                l3 = l3.next;
                l1 = l1.next;
            } else {
                ListNode node = new ListNode(l2.val);
                l3.next = node;
                l3 = l3.next;
                l2 = l2.next;
            }

        }

        while (l1 != null) {
            ListNode node = new ListNode(l1.val);
            l3.next = node;
            l3 = l3.next;
            l1 = l1.next;
        }
        while (l2 != null) {
            ListNode node = new ListNode(l2.val);
            l3.next = node;
            l3 = l3.next;
            l2 = l2.next;
        }

        return merge.next;

    }

    static void printList(ListNode head) {
        ListNode pointer = head;
        while (pointer != null) {
            System.out.println(pointer.val);
            pointer = pointer.next;
        }
    }

    public static void main(String[] args) {

        ListNode l1;
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(4);
        ListNode node4 = new ListNode(5);
        //ListNode node5 = new ListNode(5);

        l1 = node1;
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = null;
        //node5.next = null;

        ListNode l2;
        ListNode l2node1 = new ListNode(1);
        ListNode l2node2 = new ListNode(3);
        ListNode l2node3 = new ListNode(4);
        //ListNode l2node4 = new ListNode(4);
        //ListNode l2node5 = new ListNode(5);

        l2 = l2node1;
        l2node1.next = l2node2;
        l2node2.next = l2node3;
        l2node3.next = null;//l2node4;
        //l2node4.next = l2node5;
        //l2node5.next = null;
        //head = reverse(head);
        ListNode merge = mergeTwoLists(new ListNode(2), new ListNode(1));
        printList(merge);

    }
}
