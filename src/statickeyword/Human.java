package statickeyword;

public class Human {

    public static int height;
    public int depth = 65;
    public final int width = 34;

    //getter and setter
    public void setHeight(int height) {
        this.height = height;
    }

    public int getHeight() {
        return height;
    }

    //non return, non static method
    //a non static method can access both static and non static variables
    public void smile(){
        height = 76;
        depth = 98;
        System.out.println("human smile");
    }

    //non return, static method
    //a static method can access static variables only
    public static void talk(){
        height = 76;
        //depth = 98; because this variable is not static while the method is static
        //width = 45; because width is final
        System.out.println("human talk");
    }
}
