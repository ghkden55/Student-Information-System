package controller;

import error.OutOfIndexException;
import utility.Scan;

public class SISController {

    private static SISController instance = new SISController();

    OutOfIndexException ooue = new OutOfIndexException();

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

        int[] systemMenu = ooue.getIntArray(1,3);
        system = Scan.getInstance().returnInt();

        ooue.check(systemMenu, system);
        System.out.println(system + "번을 선택했습니다.");



    }


}
