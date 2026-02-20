package Pattern;

public class F14 {
    public static void main(String[] args) {

//    f1();
//      f2();
//        f3();
//        f4();
//f5();
//f6();
//f7();
//f8();
f9();



    }
    public static void f1(){
        int n=5;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void f2(){
        int n =4;
        for(int i=0;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print("* " );
            }
            System.out.println();
        }
    }
    public static void f3(){
        int n =4;
        for(int i=0;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j+" " );
            }
            System.out.println();
        }
    }
    public static void f4(){
        int n =4;
        for(int i=n;i>=0;i--){
            for(int j=0;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();

        }
    }
    public static void f5(){
        int n =4;
        for(int i=0;i<=n;i++){
            for(int j=0;j<=n-i;j++){
                System.out.print(" ");
            }

          for(int j=0;j<=i;j++){
              System.out.print("* ");
          }
            System.out.println();

        }
    }
    public static void f6(){
        int n =5;
        for(int i=n;i>=1;i--){
            for(int j=1;j<=i;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
    public static void f7() {
        int n = 5;

       for(int i=n;i>=0;i--){
           for(int j=2*n-i;j>i;j--){
               System.out.print(" ");
           }
           for(int j=1;j<=i;j++){
               System.out.print(j+" ");
           }
           System.out.println();
       }
        for(int i=1;i<=n;i++){
            for(int j=2*n-i;j>i;j--){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
    public static void f8() {
        int n = 5;
        for (int i=n;i>=2;i--){
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print(j+" ");
            }
            System.out.println();

        }
      for (int i=1;i<=n;i++){
          for(int j=1;j<=n-i;j++){
              System.out.print(" ");
          }
          for(int j=1;j<=i;j++){
              System.out.print(j+" ");
          }
          System.out.println();

      }
    }
    public static void f9(){
        int n=5;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
        for(int i=n-1;i>=1;i--){
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }

    }
}
