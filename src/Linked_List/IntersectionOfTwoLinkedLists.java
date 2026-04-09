package Linked_List;

public class IntersectionOfTwoLinkedLists {
    public static void main(String[] args) {

    }

    public static ListNode getIntersectionNode(ListNode headA, ListNode headB) {

        int alen = listLength(headA);
        int blen = listLength(headB);


        while (alen > blen) {
            alen--;
            headA = headA.next;

        }
        while (alen < blen) {
            blen--;
            headB = headB.next;

        }

        while (headA != headB) {
            headB = headB.next;
            headA = headA.next;
        }

        return headA;
    }

    private static int listLength(ListNode head) {
        int length = 0;
        ListNode node = head;

        while (node != null) {
            length++;
            node = node.next;
        }

        return length;
    }
}
