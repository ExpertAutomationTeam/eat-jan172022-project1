package oops.inheritance;

public class TestFamily {
    public static void main(String[] args) {

        //multi level inheritance (GrandFather --> Father --> Son)
        Son sean = new Son();
        sean.height();
        sean.height();
        sean.education();

        Father david = new Father();
        david.athletic();
        david.height();
        david.education();
        david.communicate();

        GrandFather joe = new GrandFather();
        joe.education();
        joe.communicate();

        //hierarchical inheritance (Animal --> GrandFather and Animal --> Bird)
        Bird sparrow = new Bird();
        sparrow.communicate();
    }
}
