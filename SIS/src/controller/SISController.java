package controller;

import error.MenuIndexOutOfBoundsException;
import utility.Scan;

public class SISController {

    private static SISController instance = new SISController();

    MenuIndexOutOfBoundsException miobe = new MenuIndexOutOfBoundsException();

    int system = 0;


    public static SISController getInstance() {

        if (instance == null) {
            instance = new SISController();
        }

        return instance;
    }


    public void startSIS() {

        System.out.println("학생 정보 시스템");
        System.out.println();
        System.out.println("1. 로그인");
        System.out.println("2. 회원 가입");
        System.out.println("3. 종료");

        try {
            system = check(1,3,Scan.getInstance().returnInt());

        } catch (MenuIndexOutOfBoundsException e) {
            System.out.println("잘못 입력했습니다. 메뉴를 다시 선택해주세요.");
        }

        switch (system) {

            case 1:
                System.out.println("1. 로그인");
                break;

            case 2:
                System.out.println("2. 회원 가입");
                break;

            case 3:
                System.out.println("3. 종료");
                break;

        }

    }


    int[] getIntArray(int i, int j) {

        int[] temp = new int[j];

        for (int k = 0 ; k <= temp.length - 1 ; k++, i++) {
            temp[k] = i;
        }

        return temp;
    }


    public int check(int startNum, int endNum, int menu) throws MenuIndexOutOfBoundsException {



        int[] temp = getIntArray(startNum, endNum);

        for (int i = 0 ; i < temp.length - 1 ; i++) {

            if (temp[i] == menu)  {
                System.out.println(menu + "번을 선택했습니다.");

            } else {
                throw miobe;
            }
        }

        return menu;
    }


}
