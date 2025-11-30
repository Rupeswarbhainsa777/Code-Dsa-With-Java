package Java_Normal_Coding_Problem;
class Node{
    int data;
    Node next;
    public Node(int data){
        this.data=data;
        next = null;
    }
}
public class LinkedList1 {

    Node head = null;

    public void add(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }

    public void display() {
        if (head == null) {
            System.out.println("Linked List is empty.");
            return;
        }
        Node current = head;
        System.out.print("Linked List: ");
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }
    public void addFirst(int data){
        Node newNode= new Node(data);
        newNode.next =head;
        head=newNode;
    }
    public void delete(int data){
        Node curr=head;
        while (curr.next!=null && curr.next.data!=data){
            curr=curr.next;
        }
        if(curr.next!=null){
            curr.next=curr.next.next;
        }
    }
}
class Test2{
    public static void main(String[] args) {
        LinkedList1 li = new LinkedList1();
        li.add(12);
        li.add(17);
        li.add(16);
        li.add(14);
li.addFirst(7);
        li.display();
li.delete(12);
        li.display();

    }
}
