package oops.inheritance;

public class Son extends Father{
    //Father class is a super class of son class
    //java doesn't support multiple inheritance - cannot have multiple super class
    //inheritance is a mechanism to acquire properties from a class to another class

    //use super in constructor
    public Son(){
        super(8);
    }

    //use super in method
    public void athleticSkills(){
        super.athletic();
        //use super in variable
        int numberOfSport = super.numberOfSport;
    }

}