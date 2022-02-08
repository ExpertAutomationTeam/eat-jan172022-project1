package parseinteger;

public class UseParser {
    public static void main(String[] args) {

        String a = "12";
        double c = 12.4;
        int b = 15;
        int d = 10;

        int total = Integer.parseInt(a) + b;

        System.out.println(total);

        System.out.println(Integer.max(b, d));


    }
}
