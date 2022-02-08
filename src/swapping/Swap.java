package swapping;

public class Swap {
    public static void main(String[] args) {

        int a = 5;
        int b = 3;

        System.out.println("before swapping");
        System.out.println(a);
        System.out.println(b);

        int temp = 0;

        temp = a;
        a = b;
        b = temp;

        System.out.println("after swapping");
        System.out.println(a);
        System.out.println(b);

    }
}
