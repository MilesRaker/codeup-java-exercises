public class HelloWorld {
    public static void main(String[] args){
        System.out.print("Hello,");
        System.out.print(" World!");

        //******Syntax, Types, and Variables Exercise******/

        int myFavoriteNumber = 2;
        String myString = "I am kind to myself";
        System.out.println(myString);
        // myString = 'I'; // error, incorrect type
        // myString = 3.14195; // error, incorrect type
        long myNumber;
        // System.out.println(myNumber); // error, myNumber may not have been initialized
        // myNumber = 3.14;// error, wrong type. expected long, given double
        myNumber = 123L; // this worked. Why? L indicates Long
        myNumber = 123; // this also worked, and says myNumber is already assigned this value
        // longs only hold whole numbers
        // float myNumber2 = 3.14; // error, assigning a double to a float
        // solution 1, cast to float
        float myNumber3 = (float) 3.14;
        //solution 2, explicitly mark assignment argument as float
        float myNumber4 = 3.14F;

        // Exercise 10: What does this code snippet do?
        int x = 5;
        System.out.println(x++);    // prints 5
        System.out.println(x);      // prints 6

        // how about this code snippet?
        int y = 5;
        System.out.println(++y);    // prints 6
        System.out.println(y);      // prints 6

        // the ++ operator can either be a pre-fix (changing the value, then returning it)
        // or a post-fix (returning the value then changing it)

        // Ex 11:
        // int class = 3; // Intelli-J is freaking out! Doesn't like me using keywords as names

        // Ex 12:
        // Guess: The type casting will not work. Some more explicit stringToInt method needs to be used
        String theNumberThree = "three";
        Object o = theNumberThree;
        // int three = (int) o;
        // System.out.println(three);
        // my guess was correct. A type conversion exception was thrown
        // will this work?:
        // int three = (int) "three"; // nope. The compiler caught the type conversion error, won't let me compile
        // line 45 gave a runtime error. The compiler did not catch the type conversion error because it didn't know
            // the type of the object o

        //Ex 13:
        int a = 4;
        // a = a + 5;
        a += 5;

        int b = 3;
        int c = 4;
        //c = c * b;
        c *=b;

        int d = 10;
        int e = 2;
        // d = d / e;
        d /= e;
        // e = e - d;
        e -= d;

        // Ex. 14
        System.out.println("Ex. 14:");
        int max = Integer.MAX_VALUE;
        System.out.println("max: " + max); // prints 2147483647
        int newMax = max + 1;
        System.out.println("newMax: " + newMax); // prints -2147483648
        // bitwise addition occurred, but ran out of allocated memory space, so the sign bit flipped negative

    }
/*  renaming the "main" disables intelli-j's "run" function
    public static void bananas(String[] args){
        System.out.println("Hello, World!");
    }*/
}

/* Running project in command line:
* 1. cd src
* 2. javac HelloWorld.java to compile
* 3. java HelloWorld to run JVM*/

