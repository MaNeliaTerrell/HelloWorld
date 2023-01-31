package HelloWorld;

import java.awt.*;
import java.sql.SQLOutput;
import java.util.Arrays;
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

//             String message = "Hello World" + "!!";
////           //System.out.println(message);
//
//            System.out.println(message.endsWith("!!"));  // true
//            System.out.println(message.startsWith("!!"));  //false
//            System.out.println(message.length());    //13
//            System.out.println(message.indexOf("l"));  // 2 (first l it can find)
//            System.out.println(message.replace("!", "*"));  //Hello World**
//            System.out.println(message.toLowerCase());  //hello world!!
//            System.out.println(message.toUpperCase());   //HELLO WORLD!!
//            System.out.println(message.trim());   ///It removes white spaces before and after a string

        //-----------SPEACIAL CHARACTERS--------

        // -------\" --------

//              String message = "Hello \"Nelia\"";
//              System.out.println(message);   //Hello "Nelia"

        // ------ \\--------

//              String message = "c:\\Windows\\...";
//              System.out.println(message);   //c:\Windows\...

        // ---------\n-------- (new line)
//                String message = "Hello \n Nelia";
//                System.out.println(message);  // Hello (first line), Nelia (next line)

        // ---------\t--------(adds space or tab)

//                String message = "Hi\t Nelia";
//                System.out.println(message);  // Hi    Nelia

        //--------ARRAYS------

//        int[] numbers = new int[5];
//        numbers[0] = 1;
//        numbers[1] = 2;
//
//        System.out.println(Arrays.toString(numbers));  // [1 , 2, 0, 0, 0] === last 3 are zero by default
//                                                        // index 0 and 1 were initialized as 1 and 2


//        int[] numbers = {2, 3, 5, 1, 4};
//
//        System.out.println(numbers.length);   // 5
//
//        Arrays.sort(numbers);
//
//        System.out.println(Arrays.toString(numbers)); // 1, 2, 3, 4, 5

        // ------- MULTI-DIMENSIONAL ARRAY --------

//        int[][] numbers = new int[2][3];    // 2 rows , 3 columns
//        numbers[0][0] = 1;
//        System.out.println(Arrays.deepToString(numbers)); //returns the string rep of the deep content
//                                           // of the multi-dimensional Object array  /// [[1, 0, 0], [0, 0, 0]]

        // --------USING CURLY BRACES-------

//        int[][] numbers = { {1, 2, 3}, {4, 5, 6 } };
//        System.out.println(Arrays.deepToString(numbers));   // [[1, 2, 3], [4, 5, 6]

        //---------CONSTANTS--------

           // final float PI = 3.14F; // final indicates that the value pf Pi cannot be changed

        //--------ARITHMETIC EXPRESSIONS-------

//        int result = 10 + 3;
//        double num = (double) 10 / (double) 3;
        int x = 1;
        x++;  //increment by 1
        int y = x++;
        int z = ++x;

        int a = 1;
        a = a + 2;
        a += 2;

//        System.out.println(result);
//        System.out.println(num);
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
        System.out.println(a);

    }
}

