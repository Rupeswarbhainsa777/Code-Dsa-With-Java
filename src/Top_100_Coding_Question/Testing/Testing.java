package Top_100_Coding_Question.Testing;

public class Testing {
    public static void main(String[] args) {
    testing();
    }

    public static void testing(){

        try {
            int a = 10;
            int b = 0;
            int result = a / b; // This will throw ArithmeticException
            System.out.println("Result: " + result);
        }
        catch (Exception e){
            System.out.println(e);
        }
        finally {

            System.out.println("I am hear");

        }



    }


}
