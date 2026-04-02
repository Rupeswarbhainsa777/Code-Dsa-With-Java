package Linked_List;

public class RotateList {
    public static void main(String[] args) {

    }
  // This approach working
    public ListNode rotateRight(ListNode head, int k) {
        if (k <= 0 || head == null || head.next == null) return head;

        int length = 1;
        ListNode newNode = head;
        while (newNode.next != null) {
            newNode = newNode.next;
            length++;

        }
        newNode.next = head;
        int n = k % length;

        int skip = length-n;

        ListNode newLast = head;
        for (int i = 0; i <skip - 1; i++) {

            newLast = newLast.next;
        }
        head = newLast.next;
        newLast.next = null;


        return head;
    }


    // this approach 210 / 232 testcases passed
//    public ListNode rotateRight(ListNode head, int k) {
//
//        if (head == null || head.next == null) return head;
//
//       int length = 0;
//
//       ListNode temp = head;
//       while (temp!=null){
//           temp = temp.next;
//           length++;
//
//       }
//       k = k%length;
//
//       ListNode node = reverseList(head);
//       ListNode prev = null;
//       ListNode curr = node;
//       ListNode firstNext = null;
//
//
//       int count =0;
//       while (curr!= null && count<k){
//           ListNode next = curr.next;
//           curr.next = prev;
//
//           prev = curr;
//           curr = next;
//
//           firstNext =next;
//           count++;
//
//       }
//       ListNode newPrev = reverseList(firstNext);
//       node.next = newPrev;
//
//       return prev;
//
//
//    }
//
//
//    public ListNode reverseList(ListNode head) {
//        if (head == null || head.next == null) return head;
//
//        ListNode prev = null;
//        ListNode curr = head;
//
//        while (curr != null) {
//            ListNode next = curr.next;
//
//            curr.next = prev;
//            prev = curr;
//            curr = next;
//
//
//        }
//        head.next = null;
//        return curr;
//
//
//    }


}
