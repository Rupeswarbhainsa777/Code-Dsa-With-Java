package Java_Normal_Coding_Problem;



public class Test {

    public static void main(String[] args) {

        counterFunction(10);

    }
    public  static  void counterFunction(int i){

        System.out.println(i);
        if(i>0){
            counterFunction(i-1);

        }
    }
}
