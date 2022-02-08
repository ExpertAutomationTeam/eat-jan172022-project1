package breakcontinue;

public class PrintNumbers {
    public static void main(String[] args) {

        for (int i = 0; i < 50 ; i++) {
            System.out.println(i);
            if (i == 30){
                break;
            }
        }

        for (int i = 0; i < 10 ; i++) {
            if (i == 4){
                continue;
            }
            System.out.println(i);
        }

    }
}
