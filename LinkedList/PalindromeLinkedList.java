package LinkedList;

import java.util.List;

public class PalindromeLinkedList {
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

    public static boolean isPalindrome(ListNode head) {
        if(head == null)
            return true;
        ListNode slow = head;
        ListNode fast = head;

        while(fast != null && fast.next !=null){
            slow = slow.next;
            fast = fast.next.next;
        }

        slow = reverse(slow);
        fast = head;

        while(fast != null && slow != null){
            if(fast.val != slow.val)
                return false;
            fast = fast.next;
            slow = slow.next;
        }

        return true;

    }

    private static ListNode reverse(ListNode head){
        ListNode p = head;
        ListNode q = null;
        ListNode r = null;

        while(p!=null){
            r=q;
            q=p;
            p=p.next;
            q.next = r;
        }
        return q;
    }
//0ms solution
    public static boolean isPalindrome1(ListNode head) {
        ListNode fast=head;
        ListNode slow=head;
        ListNode prev=null;

        //reverse first half of the elements and compare
        while(fast!=null && fast.next!=null){
            fast=fast.next.next;
            ListNode temp=slow;
            slow=slow.next;
            temp.next=prev;
            prev=temp;
        }
        if(fast!=null){
            slow=slow.next;
        }
        while(prev!=null && slow!=null){
            if(prev.val!=slow.val){
                return false;
            }
            slow=slow.next;
            prev=prev.next;
        }
        return prev==null&&slow==null;



//         ListNode temp=head;
//         Stack<Integer> st=new Stack<>();
//         while(temp!=null){
//             st.push(temp.val);
//             temp=temp.next;
//         }
//         temp=head;
//         while(temp!=null){
//             if(temp.val!=st.pop()){
//                 return false;
//             }
//             temp=temp.next;
//         }
//         return true;

    }

    public static void main(String[] args) {
        ListNode head;
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(1);
        ListNode node4 = new ListNode(2);
        ListNode node5 = new ListNode(1);

        head = node1;
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;
        node5.next = null;

        System.out.println("Is Palindrome: "+isPalindrome1(head));

    }
}
