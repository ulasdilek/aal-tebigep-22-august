public class Syntax {

    public static void main (String[] args){

        /*
         PLEASE NOTE THAT THE OPERATION PRIORITY IN JAVA IS THE SIMILAR TO MATHEMATICS:
         1 - parentheses - this includes type-casting and method arguments
         2 - multiplication and division
         3 - addition and subtraction
         For everything in the same priority order, Java starts the execution from left to right
         */

        /**
        * Mathematical Operations:
        * Addition +
        * Subtraction -
        * Multiplication *
        * Division /
        * Modulus %
        * Beware: If you divide an integer by another integer, the resulting value gets "truncated".
        * We call this phenomenon "integer division". To avoid this, we can typecast one of the integers to
        * float or double.
         */
        int a = 35;
        int b = 12;
        System.out.println("add: " + (a + b));
        System.out.println("subtract: " + (a - b));
        System.out.println("multiply: " + a * b);
        System.out.println("divide: " + (float) a / b);
        System.out.println("modulus: " + a % b);

        System.out.println(); // these wıll just print an empty line for the sake of output readability

        /**
        * Comparators and Logic Operations
        * Equal to ==
        * Not equal to !=
        * Less than <
        * Less than or equal to <=
        * Greater than >
        * Greater than or equal to >=
        * Logic AND &&
        * Logic OR ||
        * Logic NOT !
        * all of the above symbols return boolean
         */
        boolean bool1 = a > b; // true
        boolean bool2 = a < b; // false
        boolean bool3 = bool1 && bool2; // false
        boolean bool4 = bool1 || bool2; // true
        boolean bool5 = !bool4; // false
        boolean bool6 = a != b; // true

        /**
         * IF - ELSE - ELSE IF STATEMENTS:
         * An if statement consists of two parts: the control section and the action.
         * The control section is wrapped by two parentheses, and the action section is wrapped by curly brackets.
         * If the boolean value in the control section is true, the action runs. Else,
         * Java skips to the end of the if block.
         */
        if (true) {
            System.out.println("true is true so you can see this");
        }
        // Let's use a boolean variable this time
        if (bool2) {
            System.out.println("if you can see this, then bool2 is true");
        }
        System.out.println("After the second if, you will see this print");

        System.out.println(); // these wıll just print an empty line for the sake of output readability

        /**
         * We can use if statements inside if statements as there is nothing preventing us from doing so.
         * This is called nested if.
         *
         * We can also have the program run another code if the boolean in the control section is false.
         * To do that, we use else statements. An else statement is linked to the most recently placed if statement,
         * and it does not have a boolean control section. (because all of the controls take place before "else",
         * in if control sections)
         */
        if (true) {
            System.out.println("the else is not linked to this if block");
        }
        // pay attention to your logic operators and where you use parentheses. It can lead to serious logic problems in your program.
        if (bool1 && bool5 || bool4) {
            System.out.println("if you can read this, then both bool1 and bool5 are true or bool4 is true");
        }
        else {
            System.out.println("if you can read this, you bool1 or bool5 is false and bool4 is false");
        }

        System.out.println(); // these wıll just print an empty line for the sake of output readability

        /**
         * You can have an "if" inside an "else" block. Semantically speaking, this is equivalent to using "else if"
         * and to make things more easily readable, we have this in most programming languages. The points above still
         * hold with "else if".
         */

        if (bool3) {
            System.out.println("if you can see this, then bool3 is true");
        }
        else if (bool6) {
            System.out.println("if you can see this, then bool3 is false and bool6 is true");
        }
        else {
            if (bool1) {
                System.out.println("if you can see this, I did some horrible things while writing this piece of code");
            }
        }

        System.out.println(); // these wıll just print an empty line for the sake of output readability

        // There is another control block called switch-case statement. However, its use case is far more narrow than
        // if statements. So they are not substantial. If you still want to learn about them, here is a useful link:
        // https://www.tutorialspoint.com/java/switch_statement_in_java.htm

        /**
         * Most of the time while programming, we make use of loops to avoid writing the same piece of code many times.
         * There are two main types of loops: "for" loops and "while" loops
         *
         * A while loop acts like an if statement. Let's have a basic example and trace the code in runtime.
         */

        System.out.println("We are now entering the while loop");
        int i = 0;
        while (i < 10) {
            System.out.println("The current value of i: " + i);
            i = i + 1; // we are going to learn a shorthand for this assignment as it is used so commonly
        }
        System.out.println("We have not exited the while loop");
        /*
        When Java first sees the "while" keyword, it first checks whether the logical statement inside the control section
        is true. If it is, then the commands inside the block are run, line by line. After all the lines inside the block are
        executed, Java checks the control section once again and executes the commands inside the block once again, hence, a while loop.
        It runs "while the statement inside the control section is true". When the control is being done and the condition is not
        satisfied, Java exits the loop and skips to the end of the while block.
        ---| It is important to avoid endless while loops. Make sure that your logic is correct! |---
         */

        System.out.println(); // these wıll just print an empty line for the sake of output readability

        /**
         * "for" loops seem a bit more complicated at the first sight. Since it is a bit difficult to explain it with just this text,
         * I want you to check this website to understand the different sections of the for loop:
         * https://www.tutorialspoint.com/java/java_for_loop.htm
         */

        /*
        The most essential for loop can be represented in this way:
        for ( "variable declaration"; "variable control mechanism"; "variable update mechanism" ) {
            // the code to execute
        }
         */
        // we can write a code that behaves the same way as while loop example above:
        System.out.println("We are now entering the for loop");
        for (int x = 0; x < 10; x = x + 1) {
            System.out.println("The current value of x: " + x);
        }
        System.out.println("We have now exited the for loop");

        // As with if statements, for and while loops can be nested as well.

        System.out.println(); // these wıll just print an empty line for the sake of output readability

    }

}
