package LinkedList;

public class DeleteNode {
    static class ListNode{
        int val;
        ListNode next;
        ListNode(int val){
            this.val =val;
        }
    }

    public static void deleteNode(ListNode node){
        if(node.next !=null){
            node.val = node.next.val;
            node.next = node.next.next;
        }
    }

    public static void printLinkedList(ListNode head){
        while(head !=null){
            System.out.print(head.val);
            head =head.next;
        }
    }

    public static void main(String[] args) {
        ListNode head;
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);
        ListNode node4 = new ListNode(4);

        head = node1;
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = null;

        deleteNode(node3);
        printLinkedList(head);


    }
}
