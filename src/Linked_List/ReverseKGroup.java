package Linked_List;

import java.util.Stack;

public class ReverseKGroup {
    public static void main(String[] args) {

    }

    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode temp = head;

        int curr=0;
        while (curr<k){
            if(temp==null){
                return head;
            }
            temp =temp.next;
            curr++;
        }
        ListNode prevNode = reverseKGroup(temp,k);

        temp=head;
        curr=0;
        while (curr<k){

            ListNode next = temp.next;

            temp.next = prevNode;

            prevNode = temp;
            temp = next;


            curr++;
        }

        return prevNode;
    }

}
