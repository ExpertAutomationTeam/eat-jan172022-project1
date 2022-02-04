package exceptions.runtimeexception;

public class Calculation {
    public static void main(String[] args) {

        //runtime error

        int a = 10;

        int b = 3;

        System.out.println("this is line 1");

        System.out.println("this is line 2");

        try {
            int total = a / b;
            System.out.println("this is line 3 "+total);
        }catch (Exception e){
            e.printStackTrace();
            System.out.println("this is line 3 not run");
        }

        System.out.println("this is line 4");

    }
}
