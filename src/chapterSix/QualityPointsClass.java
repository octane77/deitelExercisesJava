//6.28 Write a method qualityPoints that inputs a student’s average and returns 4 if it’s 90–100,
//3 if 80–89, 2 if 70–79, 1 if 60–69 and 0 if lower than 60. Incorporate the method into an application
//that reads a value from the user and displays the result.

package chapterSix;

import java.util.Scanner;

public class QualityPointsClass {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the students average: ");
        int studentAverage = input.nextInt();
        qualityPoints(studentAverage);
    }

    private static void qualityPoints(int studentAverage) {
        if (studentAverage >= 100) {
            System.out.println("Brain Size: Mega");
        }

        if (studentAverage >= 90 & studentAverage < 100) {
            System.out.println("4");
        } else if (studentAverage >= 80 & studentAverage < 90) {
            System.out.println("3");
        } else if (studentAverage >= 70 & studentAverage < 80) {
            System.out.println("2");
        } else if (studentAverage >= 60 & studentAverage < 70) {
            System.out.println("1");
        } else {
            System.out.println("0");
        }

    }
}
