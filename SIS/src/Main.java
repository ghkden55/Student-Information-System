import controller.SISController;

public class Main {
    public static void main(String[] args) {

        while(true) {
            SISController.getInstance().startSIS();
        }

    }
}