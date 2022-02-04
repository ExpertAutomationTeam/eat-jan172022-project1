package nestedclass;

public class UseNestedClass {
    public static void main(String[] args) {

        OuterClass oc = new OuterClass();
        oc.innerA.innerMethodA();

        oc.innerB.innerMethodB();

    }
}
