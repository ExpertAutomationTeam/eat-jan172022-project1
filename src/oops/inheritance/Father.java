package oops.inheritance;

public class Father extends GrandFather{

    int height = 6;
    int numberOfSport = 5;

    public Father(){

    }
    public Father(int height){
        this.height = height;
    }

    public void height(){
        System.out.println("average 6 feet");
    }
    public void athletic(){
        System.out.println("plays soccer");
    }

}
