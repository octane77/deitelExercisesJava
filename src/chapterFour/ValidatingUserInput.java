//4.24 (Validating User Input) Modify the program in Fig. 4.12 to validate its inputs. For any input,
//        if the value entered is other than 1 or 2, keep looping until the user enters a correct value.

package chapterFour;

import java.util.Scanner;

public class ValidatingUserInput {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int userInput;
        int counter = 0;

        System.out.print("Enter an integer: ");
        userInput = input.nextInt();

        while (userInput != 1 & userInput != 2){
            System.out.println("Try again");
            counter += 1;

            System.out.print("Enter an integer: ");
            userInput = input.nextInt();
        }

        if (counter == 0){
            System.out.println("You got it right off the bat");
        }
        else {
            System.out.printf("Took you %d tries but you finally got it", counter);

        }

//        while user_input != int(1) and user_input != int(2):
//        print("Try again")
//        counter += 1
//        user_input = int(input("Enter a number: "))
//        if counter == 0:
//        print("You got it right off the bat")
//else:
//        print("Took you {} tries but you finally got it".format(counter))


    }
}
