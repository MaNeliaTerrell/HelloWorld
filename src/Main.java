package HelloWorld;

import org.w3c.dom.ls.LSInput;

import java.awt.*;
import java.sql.SQLOutput;
import java.text.NumberFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.Scanner;

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
//        int x = 1;
//        //x++;  //increment by 1
//        int y = x++;
//        int z = ++x;
//
//        int a = 1;
////        a = a + 2;
//        a += 2;    //augmented assignment operators
//
////        System.out.println(result);
////        System.out.println(num);
//        System.out.println(x);
//        System.out.println(y);
//        System.out.println(z);
//        System.out.println(a);

        //---------CASTING --------
            //Implicit casting or automatic conversion
            // byte > short > int > long > float > double
//        short x = 1;
//        int y = x + 2;
//        System.out.println(y);
//
//        double w = 1.1;
//        double t = w + 2;
//        System.out.println(t);

        //Explicit castibng

//        double x = 1.2;
//        int y = (int)x + 2;      //Explicit casting - convert x to an integer
//        System.out.println(y);    // 3

        //----- String to an integer -----

//        String x = "1";
//        Integer.parseInt(x);
//        System.out.println(x);

        // -----More examples----

//          String x ="1";
//          int y = Integer.parseInt(x) + 2 ;
//        System.out.println(y);   // 3

        //------parseDouble, parseFloat, parseShort, etc. ----

//        String f = "5.3";
//        double h = Double.parseDouble(f) + 6;
//        System.out.println(h);   // 11.3

        //-----------------MATH---------------(floor, ceil,random, round, max, min)

//        int result =  Math.round(3.4F);  // 3
        //int result =  (int)Math.ceil(3.4F);   //4
        //int result = (int)Math.floor(3.4F);  //3
        //int result =  Math.max(3, 6);  //6
        //int result =  Math.min(3, 6); //3
        //double result =  Math.random();  // returns a random decimal between 0 and 1
        //double result =  Math.random() * 100;  // returns a random number (with decimals) between 0 and 100
//        double result =  Math.round(Math.random() * 100);  // returns a whole number between 0 and 100
        //int result =  (int)Math.round(Math.random() * 100); // explicit casting for int (removes the .0)
        // int result =  (int)Math.random() * 100; //always returns a 0 - it removes the decimal point & rounds back to zero
//       int result =  (int)(Math.random() * 100); //wrapping the Math random method in () includes *100
//        System.out.println(result);

        //---------------FORMATTING NUMBERS in JAVA-------------
                //NumberFormat imports a package
                //Can't use NumberFormat as a class bec its abstract class, use the built-in method
                // of the java text. Number Fornat returns a currency format for the current default FORMAT locale

        //======getCurrencyInstance=======

//        NumberFormat currency = NumberFormat.getCurrencyInstance();
//        String result = currency.format(1234567.891);
//        System.out.println(result);  //1,234,567.89

        //=======getPercentInstance======

//        NumberFormat percent = NumberFormat.getPercentInstance();
//        String result = percent.format(0.1);

            //====OR can be written this way ======

//        String result = NumberFormat.getPercentInstance().format(0.1);  //chaining multiple methods in one line
//        System.out.println(result);  // 10%

        //----------------READING INPUT---------------
            //import Scanner util

//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Age: ");   //label the space where a user can type in an input
//        byte age = scanner.nextByte();   //can use nextFloat, nextLong, nextShort, nextDouble
//        System.out.println("You are " + age);

        //-----------Strings -------------
        // use next() for 1 token (name alone), nextLine() for multiple (name and last name, including spaces)
        //use trim method to remove all unneeded spaces a the beginning

        Scanner scanner = new Scanner(System.in);
        System.out.print("Name: ");   //label the space where a user can type in an input
//        String name = scanner.nextLine(); //or nextLine()
        String name = scanner.nextLine().trim();
        System.out.println("I am " + name);


    }
}

