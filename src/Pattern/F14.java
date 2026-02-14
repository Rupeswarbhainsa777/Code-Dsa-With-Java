package Pattern;

public class F14 {
    public static void main(String[] args) {

//    f1();
//      f2();
//        f3();
        f4();








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
    } public static void f4(){
        int n =4;
        for(int i=n;i>=0;i--){
            for(int j=0;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();

        }
    }
}
