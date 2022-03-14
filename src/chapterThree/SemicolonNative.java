package chapterThree;

import java.util.Scanner;

public class SemicolonNative {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Native aNative = new Native(0, null);

        System.out.print("Native Name: ");
        String setName = input.nextLine();
        aNative.setName(setName);

        System.out.print("Native ID: ");
        int setScvId = input.nextInt();
        aNative.setScvId(setScvId);

        System.out.printf("Native Name: %s, SCVID: %d", aNative.getName(), aNative.getScvId());

    }
}
