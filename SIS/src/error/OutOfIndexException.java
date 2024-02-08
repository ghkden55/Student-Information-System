package error;

public class OutOfIndexException {

//    public int chectMenuNumber(int[] i, int j) {
//
//        int[] temp = getIntArray(i, j);
//
//        for (int t = 0; t < temp.length - 1; t++) {
//
//            if (temp[t] != k) {
//                System.out.println("입력 가능한 범위를 초과했습니다.");
//            }
//        }
//
//        return 0;
//    }




    public int[] getIntArray(int i, int j) {

        int[] temp = new int[j];

        for (int k = 0 ; k <= temp.length - 1 ; k++, i++) {
            temp[k] = i;
        }

        return temp;
    }

    public boolean check(int[] temp, int menu) throws ArrayIndexOutOfBoundsException{

        boolean checkMenu = false;

        for (int i = 0 ; i < temp.length - 1 ; i++) {

            if (temp[i] == menu)  {
                return checkMenu = true;
            }
        }

        return checkMenu;
    }

}
