import java.awt.*;

public class TimeTest {
    public static void main(String [] args){
       /* Time1 time1 = new Time1();
        System.out.println("The initial Universal time is :");
        System.out.println(time1.toUniversal());
        System.out.println("The Standard time is:");
        System.out.println(time1.toString());

        time1.setTime(16, 20, 30);
        System.out.println("Universal time after SetTime is :");
        System.out.println(time1.toUniversal());
        System.out.println("Standard time is :");
        System.out.println(time1.toString());
        try {
            time1.setTime(99, 99, 99);

        }
        catch (IllegalArgumentException e)
        {
            System.out.printf("Exception %s \n\n", e.getMessage());
        }
        System.out.println(time1.toString());

        */

       Time2 t1 = new Time2();
       Time2 t2 = new Time2(14);
       Time2 t3 = new Time2(15, 35);
       Time2 t4 = new Time2(15, 16, 45);
       Time2 t5 = new Time2(t4);

       System.out.println("Constructed with \n");
       System.out.println("t1: all constructed with default values:");
       System.out.printf("%s \n", t1.toUniversal());
       System.out.printf("%s \n", t1.toString());

        System.out.println("\nt2: hour specified, minutes and seconds with default values:");
        System.out.printf("%s \n", t2.toUniversal());
        System.out.printf("%s \n", t2.toString());

        System.out.println("\nt3: hour & minutes specified, seconds with default values:");
        System.out.printf("%s \n", t3.toUniversal());
        System.out.printf("%s \n", t3.toString());

        System.out.println("\nt4: hour, minutes & seconds specified:");
        System.out.printf("%s \n", t4.toUniversal());
        System.out.printf("%s \n", t4.toString());

        System.out.println("\nt5: hour, minutes & seconds specified with t4 object values:");
        System.out.printf("%s \n", t4.toUniversal());
        System.out.printf("%s \n", t4.toString());
        try
        {
            Time2 t6 = new Time2(5, 67, 89);
        }
        catch (IllegalArgumentException e)
        {
            System.out.printf("%s", e.getMessage());
        }
    }
}
