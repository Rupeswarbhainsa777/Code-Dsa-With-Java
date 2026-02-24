package JavaDaily;

public class Recosion {
    public static void main(String[] args) {
        isTi(7);
    }
    public static void isTi(int n){

      if(n>10){
          return;
      }
        System.out.println(n);

      isTi(n+1);

    }
}
