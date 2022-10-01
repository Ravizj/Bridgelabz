package DayFour;

public class VariablesTypes {

    // 3 types of Variables
    // local , static , instance

    // Local Variables
    // Variables declared within a method or within a block are called local variables.
    // These variables can only be used within a block or within a method
    // Its mandatory to initialize local variables if we are using them.

    static void m3() {
       int y = 1234;
        System.out.println(y);
//        m1();
    }

    static void m1() {
        int x = 30;
        System.out.println("m1");
        System.out.println(x);
        m3();
    }

    public static void main(String[] args) {
        int x = 0;
        System.out.println(x);
        m1();
        m3();
        m1();
    }
}
