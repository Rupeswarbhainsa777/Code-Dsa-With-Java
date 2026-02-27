package Pattern;

public class Characters {
    public static void main(String[] args) {
      c1();
        System.out.println();
        c2();
        System.out.println();
        c3();
        System.out.println();
        c4();
    }

    public static void c1(){

        int n = 5;
        for(int i=1;i<=n;i++){
            char ch ='A';
            for (int j=1;j<=i;j++){
                System.out.print(ch+" ");
                ch++;
            }
            System.out.println();
        }

    }
    public static void c2(){

        int n = 5;
        for(int i=n;i>=1;i--){
            char ch ='A';
            for (int j=1;j<=i;j++){
                System.out.print(ch+" ");
                ch++;
            }
            System.out.println();
        }

    }
    public static void c3(){

        int n = 5;
        for(int i=1;i<=n;i++){
            char ch ='A';
            for (int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for (int j=1;j<=i;j++){
                System.out.print(ch+" ");
                ch++;
            }
            System.out.println();
        }

    }
    public static void c4(){

        int n = 5;
        for(int i=1;i<=n;i++){
            char ch ='A';
           for(int j=1;j<=n-i;j++){
               System.out.print(" ");
           }
           for (int j=1;j<=i;j++){
               System.out.print(ch);
               ch++;
           }
            System.out.println();
        }

    }
}
