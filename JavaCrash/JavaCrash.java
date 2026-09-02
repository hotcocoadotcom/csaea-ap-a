public class JavaCrash {

    public static void main(String[] args) {

        // comments

        /*
            multiline
            comment
        */

        System.out.println("word");


        //variable declarores
        //PRIMITIVE VARIABLES
        int a;
        double b;
        boolean c;

        a = 4;
        b = 5.5;
        c = false;

        //arithmetic  operators
        // + - / * %
        // += -= /= %=

        int d = 3;
        d += 7;

        System.out.println("d = " + d);

        // increment and decrement by one:
        // -- ++

        d--;

        System.out.println("d = " + d);

        // comparisons
        // > < <= >= == !=
        System.out.println(4 < 5);
        System.out.println(7 == 4);
        System.out.println(2 >= 2);

        // logical operatior
        // ! && ||

        boolean e = false; boolean f = true;

        System.out.println(!e); //true
        System.out.println(e && f); //false
        System.out.println(e || f); //true
        System.out.println(e || f && !e); //true





    }

}