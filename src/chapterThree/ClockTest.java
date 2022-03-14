package chapterThree;

import java.util.Scanner;

public class ClockTest {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Clock clock = new Clock(0, 0, 0);

        System.out.print("Deitel Digital Clock");
        System.out.print("Please set the time, Hour: ");
        Integer deitelHour = input.nextInt();
        clock.setHour(deitelHour);

        System.out.print("Please set the time, Minute: ");
        Integer deitelMinute = input.nextInt();
        clock.setMinute(deitelMinute);

        System.out.print("Please set the time, Second: ");
        Integer deitelSecond = input.nextInt();
        clock.setSecond(deitelSecond);

        System.out.println("Deitel Digital Clock");
        System.out.println("HH:MM:SS");
        System.out.printf("%d:%d:%d", clock.getHour(), clock.getMinute(), clock.getSecond());

        }
}
