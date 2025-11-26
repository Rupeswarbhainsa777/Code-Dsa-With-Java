package Java_Normal_Coding_Problem;


import java.util.LinkedList;

public class Test {

    public static void main(String[] args) {

        LinkedList<Integer> li = new LinkedList<>();
        li.add(1);
        li.add(2);
        li.add(3);
        li.add(4);
        li.add(5);

        System.out.println(li.getFirst());

        for(int x : li){
            System.out.println(x);
        }


    }

}
