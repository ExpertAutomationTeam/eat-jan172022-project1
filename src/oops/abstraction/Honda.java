package oops.abstraction;

public class Honda implements Car, Motor {

    //from car interface
    public void start() {
        System.out.println("starts without key");
    }

    public void stop() {
        System.out.println("secured brake");
    }

    public void carShape() {
        System.out.println("ultra spacious car");
    }

    //from motor interface
    public void engine() {
        System.out.println("with double turbo");
    }

    public void fuelType() {
        System.out.println("electric");
    }

    //from Honda class
    public void doors(){
        System.out.println("3 doors car");
    }
}
