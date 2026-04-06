package Linked_List;

public class AddTwoNumbers {
    public static void main(String[] args) {


        String st = "12";
        int x = Integer.parseInt(st);
        if (x == 12) {
            System.out.println(x);
        }


    }

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        ListNode res = new ListNode(0);

        ListNode tre = res;
        int carry = 0;
        while (l1 != null || l2 != null) {
            int sum = 0 + carry;

            if (l1 != null) {
                sum += l1.val;
                l1 = l1.next;
            }
            if (l2 != null) {
                sum += l2.val;
                l2 = l2.next;
            }
            carry = sum / 10;
            sum = sum % 10;

            tre.next = new ListNode(sum);
            tre = tre.next;
        }
        if (carry == 1) {
            tre.next = new ListNode(1);
        }

        return res.next;
    }

    public static ListNode reverseList(ListNode head) {
        if (head == null || head.next == null) return head;

        ListNode prev = null;
        ListNode curr = head;

        while (curr != null) {
            ListNode next = curr.next;

            curr.next = prev;
            prev = curr;
            curr = next;


        }
        head.next = null;
        return curr;


    }
}
