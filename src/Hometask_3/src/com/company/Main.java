package com.company;

import java.lang.reflect.Array;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {

//------------------------------------------------
// Task 1. Write a program which prints to the console some string 5 times.
// -----------------------------------------------
//    public static void main(String[] args) {
//        System.out.print("hi");
//        System.out.print("hi");
//        System.out.print("hi");
//        System.out.print("hi");
//        System.out.print("hi");
//    }

//------------------------------------------------
// Task 2. Write a program which creates and initializes all primitive data types.
// -----------------------------------------------
//    public static void main(String[] args) {
//        byte q = 1;
//        short w = 34;
//        int a = 27498320;
//        long e = 89743284;
//        float y = 1.5F;
//        double p = 9.5;
//        char u = 123;
//        boolean l = true;
//        System.out.println(q);
//        System.out.println(w);
//        System.out.println(a);
//        System.out.println(e);
//        System.out.println(y);
//        System.out.println(p);
//        System.out.println(u);
//        System.out.println(l);
//    }


//------------------------------------------------
// Task 3. Create a program which calculates square of a rectangle.
// -----------------------------------------------
//    public static void main(String[] args) {
//        int a = 10;
//        int b = 5;
//        int c = a * b;
//        System.out.println(c);
//    }


//------------------------------------------------
// Task 4. Fix the program to get the correct result:
// -----------------------------------------------
//    public static void main(String[] args) {
//        float a = 5;
//        float b = 10;
//        float result = (a / b);
//
//            System.out.println(result);
//        }
//    }

//------------------------------------------------
// Task 5. Change the operations to get the result 20:
// -----------------------------------------------
//        public static void main(String[] args) {
//             int a = 1;
//             int b = 3;
//             int c = 9;
//             int d = 27;
//            int result =  d - c + b - a;
//
//            System.out.println(result);
//        }


//------------------------------------------------
// Task 6. Comment redundant strings to get the output "Happy Java Learning".
// -----------------------------------------------
//        public static void main(String[] args) {
//            //String s = "Java";
//            System.out.print("Happy ");
//            System.out.println("Java Learning");
//           // System.out.println("programming");
//           // System.out.print("Happy Java");
//            // System.out.println("weekend");
//           // System.out.println(s);
//           // System.out.print("Python");
//            //System.out.print(" ");
//            //System.out.println("Learning");
//        }


//------------------------------------------------
// Task 7. Comment variables which are never used.
// -----------------------------------------------
//    public static void main(String[] args) {
//        int a = 10;
//        int b = 15;
//        double c = b + 38;
//        int d = a + 12;
//        double e = 12.3;
//        //int s = s + a;
//        int s1 = a + b;
//        // String s2 = "a";
//        int s3 = s1 + a;
//        int s4 = s3 + b;
//        System.out.println(c + s4); //+ s);


    //------------------------------------------------
// Task 8. Write a program which prints "Hello world" to the console using methods transformIntToChar and printList only.
// -----------------------------------------------
//  (не работает)
//  Write a program which prints "Hello world" to the console using methods transformIntToChar and printList only.
//    public static void main(String[] args) {
//
//        String hello = "Hello world!";
//        char[] charArray = hello.toCharArray();
//        int[] massInt = new int[charArray.length];
//        for (int i = 0; i < charArray.length; i++) {
//            massInt[i] = charArray[i];
//        }
//
//        ArrayList<Character> buffer = transformIntToChar(massInt);
//        printList(buffer);
//    }
//
//    private static ArrayList<Character> transformIntToChar(int... values) {
//        ArrayList<Character> buffer = new ArrayList<>();
//        for (int i : values) {
//            buffer.add(((char) i));
//        }
//        return buffer;
//    }
//
//    private static void printList(ArrayList<Character> characters) {
//        for (char c : characters) {
//            System.out.print(c);
//        }
//    }
//}


//------------------------------------------------
//              Block Java Loops
//------------------------------------------------


//------------------------------------------------
// Task 1. Print numbers from 10 to 20 using all known cycles.
// -----------------------------------------------
// метод for
//public static void main(String[]args)
//    {
//    int i = 0;
//    for (i = 10; i <= 20; i++)
//        {
//                System.out.println(i);
//        }
//    }

//метод do
// от большего к меньшему вывод
//    public static void main(String[]args) {
//    int i = 20;
//    do {
//        System.out.println(i);
//        i--;
//    }
//    while (i >= 10);
//    }

// метод do
// от меньшего к большему вывод
//    public static void main(String[]args) {
//        int i = 10;
//        do {
//            System.out.println(i);
//            i++;
//        }
//        while (i <= 20);
//    }


// (не работает)
// метод while
//    public static void main(String[]args) {
//        int i = 10;
//        while (i <= 20)
//        { System.out.println(i);
//            i++;
//        }
//    }


//------------------------------------------------
// Task 2. Print all the numbers from 1 to 100, which are divided by 3 without a remainder.
// -----------------------------------------------
//public static void main(String[]args)
//    {
//        int i = 0;
//        for (i = 1; i <= 100; i++)
//             {
//                if (i % 3 == 0)
//                {
//                   System.out.println(i);
//                }
//    }


//------------------------------------------------
// Task 3. Write a function which calculates and returns the minimum of 4 arguments.
// -----------------------------------------------
//public static void main(String[] args) {
//   }
//    public static int min(int a, int b, int c, int d) {
//     return min(
//       min(a,b),min(c,d)
//     );
//    }
//
//    public static int min(int a, int b) {
//    if ( a > b) return b;
//        return a;
//            }


}














