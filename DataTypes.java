package DayFour;


// Data types => Primitive and Non-Primitive
// Primitive => byte,short,int,long,float,double,char,boolean
// Non-Primitive => class,interface,enum,array
public class DataTypes {

    public static void main(String[] args) {
        byte b = 123; // 0   // 1 byte  // -127 to 128
        short s = 12; // 0   // 2 byte  //
        int i = 10;   // 0   // 4 byte  //
        long l = 23;  // 0   // 8 byte  //
        float f = 12.5F; // 0.0F  // 4 byte
        double d = 122.4; // 0.0  // 8 byte
        char c = 'a';  // '\u0000' // 2 byte
        boolean var = true; // false // 1 bit
        System.out.println(b);
        System.out.println(s);
        System.out.println(i);
        System.out.println(l);
        System.out.println(f);
        System.out.println(d);
        System.out.println(c);
        System.out.println(var);
    }
}
