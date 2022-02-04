package oops.abstraction;

public class Toyota extends ModernCar implements Car, Motor{

    //method from car interface
    public void start() {
        System.out.println("car start with key");
    }

    public void stop() {
        System.out.println("car brakes");
    }

    public void carShape() {
        System.out.println("6 feet long and 4 feet wide");
    }

    //method from car toyota class
    public void color(){
        System.out.println("white");
    }

    public void engine() {
        System.out.println("engine with turbo");
    }

    public void fuelType() {
        System.out.println("diesel type");
    }

    public void hydraulicBrake() {
        System.out.println("hydraulic brake");
    }
}
