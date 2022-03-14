//6.19 (Displaying a Square of Any Character) Modify the method created in Exercise 6.18 to receive
//        a second parameter of type char called fillCharacter. Form the square using the char provided
//        as an argument. Thus, if side is 5 and fillCharacter is #, the method should display
//        #####
//        #####
//        #####
//        #####
//        #####
//        Use the following statement (in which input is a Scanner object) to read a character from the user
//        at the keyboard:
//        char fill = input.next().charAt(0);

package chapterSix;

import java.util.Scanner;

public class DisplayingASquareOfAnyCharacter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a fill character: ");
        char fill = input.next().charAt(0);

        System.out.print("Enter an integer: ");
        int integer = input.nextInt();
        squareOfAsterisks(integer, fill);
    }

    private static void squareOfAsterisks(int side, char fill) {
        for(int i = 0; i < side; i++) {
            for (int j = 0; j < side; j++) {
                System.out.print(fill);
            }
            System.out.println();
        }
    }
}


