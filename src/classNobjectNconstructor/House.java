package classNobjectNconstructor;

public class House {

    //variables
    int address = 123;
    String houseName = "white house";
    String houseColor;
    int houseSize;

    //constructor1
    //"this" keyword refers to global variable
    public House(String houseColor){
        this.houseColor = houseColor;
    }

    //constructor2
    public House(String houseColor, int houseSize){
        this.houseColor = houseColor;
        this.houseSize = houseSize;
    }

    //constructor3 - default constructor
    public House(){

    }

    //non return methods
    public void room(){
        System.out.println("sleep well zzzzzzzz");
    }

    public void kitchen(){
        System.out.println("cook food");
    }

    //return methods
    public String carType(){
        String car = "camry";
        return car;
    }

}
