//6.34 (Table of Binary, Octal and Hexadecimal Numbers) Write an application that displays a
//table of the binary, octal and hexadecimal equivalents of the decimal numbers in the range 1
//through 256. If you aren’t familiar with these number systems, read online Appendix J first.

package chapterSix;

public class TableOfBinaryOctalAndHexadecimalNumbers {
    public static void main(String[] args) {
        integerValue();
    }

    private static void integerValue() {
        for(int i = 1; i < 257; i++) {
            System.out.printf("Integer value: %d, Hexadecimal value: %s, Binary value: %s, Octal value: %s%n", i, Integer.toHexString(i), Integer.toBinaryString(i), Integer.toOctalString(i));
        }
    }
}