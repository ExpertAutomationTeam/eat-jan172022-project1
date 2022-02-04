package nestedclass;

public class OuterClass {
    //OuterClass instance variable
    private int outerNum1 = 10;

    //object of the nested innerA class
    InnerA innerA = new InnerA();//we need to create object in the outer class to access to the inner class
    //object of the nested innerB class
    InnerB innerB = new InnerB();

    //OuterClass default constructor
    public OuterClass(){

    }
    //OuterClass method, it gives us access to the nested class using the objects
    public void outerMethodA(){
        System.out.println("Outer class method");
        innerA.innerMethodA();//use the object innerA of the nested class InnerA to access the method
        innerB.innerMethodB();//use the object innerB of the nested class InnerB to access the method
    }
    private void outerMethodB(){
        System.out.println("private method statement");
    }
    //create InnerA class (nested class)
    public class InnerA{
        //InnerA constructor
        public InnerA(){
            //InnerA instance variable
            int numA = 10;
            outerNum1 = 25;//can access private variables of the OuterClass
        }
        //InnerA method
        public void innerMethodA(){
            System.out.println("Inner A Method");
        }
    }//end innerA class

    //create InnerB class (nested class)
    public class InnerB{
        //InnerB class instance variable
        int numB = 5;
        //InnerB class default constructor
        public InnerB(){
        }
        //InnerB class method
        public void innerMethodB(){
            System.out.println("Inner B method");
        }
    }//end inner class B

}//end outer class
