package oops.polymorphism;

public class Calculator {

    public void add(int a, int b){
        int total = a + b;
        System.out.println(total);
    }

    public void sub(int a, int b){
        int total = a - b;
        System.out.println(total);
    }

    //overloading: in the same class, having the same method name with different number of parameters
    public void add(int a, int b, int c){
        int total = a + b + c;
        System.out.println(total);
    }
    public void add(int a, int b, int c, int d){
        int total = a + b + c + d;
        System.out.println(total);
    }
}
