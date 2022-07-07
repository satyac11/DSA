package LinkedList;

public class LinkedListUtility {

    public static void printLinkedList(ListNode head){
        while(head !=null){
            System.out.print(head.val);
            head = head.next;

        }
    }
}
