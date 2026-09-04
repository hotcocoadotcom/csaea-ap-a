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

        boolean f = false; boolean t = true;

        System.out.println(!f); //true
        System.out.println(f && t); //false
        System.out.println(f || t); //true
        System.out.println(f || t && !f); //true

        int g = (int)5.5;

        System.out.println(g);

        double h = (double)5/6;

        System.out.println(h);



        String s1 = "good afternoon,";
        String s2 = " good evening, ";
        s2 += "and goodnight";
        System.out.println(s1 + s2);

        int[] arry1 = new int[10];

        System.out.println(arry1);
        System.out.println("length: " + arry1.length);

        arry1[0] = 11;
        arry1[1] = 2;

        System.out.println("Remainder: "+ arry1[0] % arry1[1]);

        int[] arry2 = {34, 52, 3, 64, 32};

        int[][] arryGrid1 = new int[4][3];


    }

}