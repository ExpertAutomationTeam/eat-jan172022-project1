package statickeyword;

public class TestHuman {
    public static void main(String[] args) {

        //to access a non static properties, we use class object
        Human human = new Human();
        System.out.println(human.depth);
        System.out.println(human.width);
        human.smile();

        //to access static properties, we use the class name
        //System.out.println(Human.height);
        Human.talk();

        //static variable belongs to class
        //non static variable belongs to object
        Human jack = new Human();
        jack.setHeight(15);
        System.out.println(jack.getHeight());

        Human john = new Human();
        john.setHeight(20);
        System.out.println(john.getHeight());

        System.out.println(jack.getHeight());
    }
}
