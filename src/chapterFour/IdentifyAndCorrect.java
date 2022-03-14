package chapterFour;

import java.util.Scanner;

public class IdentifyAndCorrect {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int c = 0;
        int product = 0;

        while (c <= 5) {
            product *= c;
            ++c;
        }
        System.out.println(c);
        System.out.println(product);


        System.out.print("Enter a 1 or 0: ");
        int gender = input.nextInt();

        if (gender == 1) {
            System.out.println("Woman");
            }
         else; {
             System.out.println("Man");
             }
    }
}