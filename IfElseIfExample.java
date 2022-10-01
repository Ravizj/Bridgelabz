package DayFour;

public class IfElseIfExample {


    static void m1(int x) {
        if (x > 30) {
            System.out.println("x is greater than 30");
        }
        else if(x>15 || x<=30){
            System.out.println("x is in range 16 to 30");
        }
        else{
            System.out.println("x is smaller than equal to 15");
        }
    }

    public static void main(String[] args) {
        m1(15);
    }
}
