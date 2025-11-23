package Code_75;

import java.util.Stack;

public class AstroidProblem {
    public static void main(String[] args) {

        int arr [] ={5,-5,-5};

        int a2[] = astridCollision(arr);
        for (int i=0;i<a2.length;i++) {
            System.out.println(a2[i]+" ");
        }


    }
    public static int[] astridCollision(int []a){
        Stack<Integer> st =new Stack<>();

        boolean shouldPush =true;
        for(int i=0;i<a.length;i++){
            shouldPush =true;
            while (!st.isEmpty()) {
                int peeek = st.peek();
                System.out.println(peeek+" "+(a[i]*-1));
                if (peeek > 0 && peeek == a[i] * -1) {

                    st.pop();
                    shouldPush = false;
                    break;
                } else if (peeek == a[i] || peeek * a[i] > 0 || (peeek < 0 && a[i] > 0)) {
                    break;
                } else if (Math.abs(peeek) > Math.abs(a[i])) {
                    shouldPush = false;
                    break;

                } else if (Math.abs(peeek) < Math.abs(a[i])) {
                    st.pop();

                }
            }
                if (shouldPush){
                    st.push(a[i]);
                }

        }

        int arr[] = new int[st.size()];
        int j=0;
        for(int x : st){
            arr[j]=x;
            j++;
        }
        return arr;


    }
}
