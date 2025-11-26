package Code_75;

import java.util.LinkedList;
import java.util.Queue;

public class RecentCounter {
    Queue<Integer> q;
  public   RecentCounter(){
      q=new LinkedList<>();


    }
    public int ping(int t){
      q.add(t);
      while (q.peek() < t-3000){
          q.poll();
      }
      return q.size();
    }





    public static void main(String[] args) {
        RecentCounter counter = new RecentCounter();

        // Test cases
        boolean passed = true;
        passed &= counter.ping(1) == 1;
        passed &= counter.ping(100) == 2;
        passed &= counter.ping(3001) == 3;
        passed &= counter.ping(3002) == 3;

        if (passed) {
            System.out.println("All test cases passed!");
        } else {
            System.out.println("Some test cases failed.");
        }
    }
}
