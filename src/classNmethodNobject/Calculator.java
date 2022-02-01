package classNmethodNobject;

public class Calculator {//outer class
    //class = blueprint or plan
    //global variables belong to class
    int a = 10;
    int b = 5;

    //access modifier: public, private, protected, default

    //method is non return = no value
    protected void addition(int a, int b){
        //c and d are local variable;
        int total = a + b;
        System.out.println(total);
    }

    public void subtraction(){
        int total = a - b;
        System.out.println(total);
    }

    //return method = value
    public int division(){
        int total = a / b;
        return total;
    }

    SubClass sc = new SubClass();

    public class SubClass{//inner class

        public String mySubClass(){
            return "sub class method";
        }
    }
}
