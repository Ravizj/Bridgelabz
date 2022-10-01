package DayFour;


// There can be only one public class in a single source file(.java file)
// When we run a program , .java file is given to java compiler
// Compiler takes the .java file and converts it into byte code(.class file)
// .class file is given to JVM(Java Virtual Machine).
// The JVM interprets the code and converts in into machine readable form
// Finally Main thread present in JVM calls the main method.

// JVM Architecture -> Durgasoft

public class JVMExample {

    static void m1(){
        int z = 30;
        char ch = 'A';
        System.out.println(z);
        System.out.println(ch);
        System.out.println("m1 method");
    }

    //
    public static void main(String[] args) {
        System.out.println("main method");
        int x = 20;
        System.out.println(x);
        m1();
        System.out.println("main method ends");
    }

}


