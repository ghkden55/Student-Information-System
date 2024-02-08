package utility;

import java.util.Scanner;

public class Scan {

    static Scan instance = new Scan();
    static Scanner sc = new Scanner(System.in);


    Scan() {}


    public static Scan getInstance() {

        if ((instance == null) || (sc == null)) {
            instance = new Scan();
            sc = new Scanner(System.in);
        }

        return instance;
    }


    public int returnInt() {

        int i = 0;

        System.out.print("입력: ");
        i = sc.nextInt();

        return i;
    }

}
