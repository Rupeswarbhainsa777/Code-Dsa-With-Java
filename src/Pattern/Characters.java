package Pattern;

public class Characters {
    public static void main(String[] args) {
      c1();
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
}
