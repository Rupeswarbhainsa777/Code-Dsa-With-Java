//package Java_Normal_Coding_Problem;
//
//
//import java.lang.classfile.components.ClassPrinter;
//
//class AddTwoNum {
//    public ClassPrinter.ListNode addTwoNumbers(ListNode l1, ListNode l2) {
//        ListNode head =null;
//        ClassPrinter.ListNode tail =null;
//        int carry =0;
//        while(l1 !=null || l2!=null || carry!=0 ){
//            int vl1 = (l1==null)?0:l1.val;
//            int vl2 = (l2==null)?0:l2.val;
//            int value = vl1+vl2+carry;
//
//            ListNode newNodw = new  ListNode(value%10);
//            carry = value/10;
//
//            if(head==null){
//                head= newNodw;
//                tail= newNodw;
//            }
//            else{
//                tail.next=newNodw;
//                tail=tail.next;
//            }
//            if(l1!=null){
//                l1=l1.next;
//            }
//            if(l2!=null){
//                l2=l2.next;
//            }
//        }
//
//        return head;
//
//    }
//}