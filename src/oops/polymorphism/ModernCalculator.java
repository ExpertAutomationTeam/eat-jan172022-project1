package oops.polymorphism;

public class ModernCalculator extends Calculator{

    //overriding: in the different class that extends to the former class (with @Overriding annotation), having the same method name with same parameters and different body
    @Override
    public void sub(int a, int b){
        int total = a - b + 10;
        System.out.println(total);
    }
}
