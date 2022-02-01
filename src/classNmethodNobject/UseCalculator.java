package classNmethodNobject;

public class UseCalculator {//a runnable class
    public static void main(String[] args) {

        //class object = instance
        Calculator cal = new Calculator();

        System.out.println(cal.sc.mySubClass());

        cal.addition(8, 7);

        cal.subtraction();

        System.out.println(cal.division());
        //System.out.println(cal.a);
        //System.out.println(cal.b);

        int result = cal.division();
        System.out.println(result);

    }
}
