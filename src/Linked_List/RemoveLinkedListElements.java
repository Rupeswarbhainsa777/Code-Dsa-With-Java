package Linked_List;

public class RemoveLinkedListElements {
    // leetcode 203
    public static void main(String[] args) {

    }

    public static ListNode removeElements(ListNode head, int val) {

        ListNode dummy = new ListNode();
        dummy.next = head;
        ListNode pont = dummy;

        while (pont.next != null) {
            if (pont.next.val == val) {
                pont.next = pont.next.next;
            }
            else {
                pont = pont.next;
            }
        }
        return dummy.next;

    }
}
