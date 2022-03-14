//5.16 (Bar Chart Printing Program) One interesting application of computers is to display
//graphs and bar charts. Write an application that reads five numbers between 1 and 30. For each
//number that’s read, your program should display the same number of adjacent asterisks. For example,
//if your program reads the number 7, it should display *******. Display the bars of asterisks after
//you read all five numbers.

package chapterFive;


import java.util.Scanner;

public class BarChartPrintingProgram {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a five digit integer: ");
        int fiveIntegers = input.nextInt();
        int int1, int2, int3, int4, int5;

        int1 = fiveIntegers/10_000;
        int2 = fiveIntegers%10_000/1000;
        int3 = fiveIntegers%10_000%1000/100;
        int4 = fiveIntegers%10_000%1000%100/10;
        int5 = fiveIntegers%10_000%1000%100%10;

        if (int1 > 0 & int1 <30 | int2 > 0 & int2 <30 | int3 > 0 & int3 <30 | int4 > 0 & int4 <30 | int5 > 0 & int5 <30){
            System.out.print(int1+": ");
            for (int i = 0; i <int1; i++){
                System.out.print("*");
            }
            System.out.println();
            System.out.print(int2+": ");
            for (int i = 0; i <int2; i++){
                System.out.print("*");
            }
            System.out.println();
            System.out.print(int3+": ");
            for (int i = 0; i <int3; i++){
                System.out.print("*");
            }
            System.out.println();
            System.out.print(int4+": ");
            for (int i = 0; i <int4; i++){
                System.out.print("*");
            }
            System.out.println();
            System.out.print(int5+": ");
            for (int i = 0; i <int5; i++){
                System.out.print("*");
            }
        }

        else
            System.exit(-1);
    }
}