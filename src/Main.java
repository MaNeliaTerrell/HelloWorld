package HelloWorld;

import java.awt.*;
import java.sql.SQLOutput;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
//        int myAge = 30;
//        int herAge = myAge;
//        System.out.println(herAge);

//          byte age = 30;
//          long viewsCount = 3_123_456_789L;
//          float price = 10.99F;
//          char letter = 'A';
//          boolean isEligible = true;

        //-------PRIMITIVE VS REFERENCE TYPE

            // primitive
//            byte age = 30;

            //reference
//            Date now = new Date();
//            System.out.println(now);

            //-----primitive----

//            byte x = 1;
//            byte y = x;
//            x = 2;
//        System.out.println(y); // 1

            //-----REFERENCE-----

//            Point point1 = new Point(x:1, y:1);
//            Point point2 = point1;
//            point1.x = 2;
//            System.out.println(point2);  //Point(x:2, y:1)

            // --------STRINGS-------

             String message = "Hello World" + "!!";
//           //System.out.println(message);

            System.out.println(message.endsWith("!!"));  // true
            System.out.println(message.startsWith("!!"));  //false
            System.out.println(message.length());    //13
            System.out.println(message.indexOf("l"));  // 2 (first l it can find)
            System.out.println(message.replace("!", "*"));  //Hello World**
    }
}

