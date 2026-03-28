package Top_100_Coding_Question.Opps_JavaBasics;

public class MethodOverloading {
    public static void main(String[] args) {
        Calculus calculus = new Calculus();
        calculus.add(1,2);
        calculus.add(1.5,4.5);
        calculus.add("Str","Str");

    }

}
class Calculus{

    public void add(int num1,int num2){
        System.out.println(num1+num2);
    }public void add(double num1,double num2){
        System.out.println(num1+num2);
    }public void add(String num1,String num2){
        System.out.println(num1+num2);
    }
}