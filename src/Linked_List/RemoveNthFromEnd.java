package Linked_List;

public class RemoveNthFromEnd {
    public static void main(String[] args) {

    }

    public static ListNode removeNthFromEnd(ListNode head, int n) {

        ListNode rev = reverseList(head);

        if (n == 1) {
            return reverseList(rev.next);
        }

        ListNode curr = rev;

        for (int i=1;i<n-1;i++){
            curr =curr.next;
        }
        curr.next =curr.next.next;

        return  reverseList(rev);

    }

    public static ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;

        while (curr != null) {
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        return prev;
    }
}

