//2.31 (Table of Squares and Cubes) Using only the programming techniques you learned in this chapter, write an application that calculates the squares and cubes of the numbers from 0 to 10 and prints the resulting values in table format, as shown below.
//
//        number square cube
//        0 	0 	    0
//        1 	1	    1
//        2 	4 	    8
//        3 	9 	    27
//        4 	16 	    64
//        5 	25  	125
//        6 	36  	216
//        7 	49  	343
//        8 	64  	512
//        9 	81  	729
//        10 	100     1000

package chapterTwo;

public class SquaresCubes {
    public static void main(String[] args) {
        System.out.println("number square cube");
        int x = 0;
        System.out.printf("%d, %d, %d%n", x, (x*x), (x*x*x));
        x = 1;
        System.out.printf("%d, %d, %d%n", x, (x*x), (x*x*x));
        x = 2;
        System.out.printf("%d, %d, %d%n", x, (x*x), (x*x*x));
        x = 3;
        System.out.printf("%d, %d, %d%n", x, (x*x), (x*x*x));
        x = 4;
        System.out.printf("%d, %d, %d%n", x, (x*x), (x*x*x));
        x = 5;
        System.out.printf("%d, %d, %d%n", x, (x*x), (x*x*x));
        x = 6;
        System.out.printf("%d, %d, %d%n", x, (x*x), (x*x*x));
        x = 7;
        System.out.printf("%d, %d, %d%n", x, (x*x), (x*x*x));
        x = 8;
        System.out.printf("%d, %d, %d%n", x, (x*x), (x*x*x));
        x = 9;
        System.out.printf("%d, %d, %d%n", x, (x*x), (x*x*x));
        x = 10;
        System.out.printf("%d, %d, %d%n", x, (x*x), (x*x*x));
    }
}
