package Top_100_Coding_Question.Opps_JavaBasics;

public class Singleton {

    private static Singleton instance;

    private Singleton() {
        System.out.println("Singleton Instance Created");
    }

    // Step 3: Public method to provide access to the instance
    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton(); // created only once
        }
        return instance;
    }
}
