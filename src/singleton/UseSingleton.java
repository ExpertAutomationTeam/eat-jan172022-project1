package singleton;

public class UseSingleton {
    public static void main(String[] args) {

        Singleton singleton = Singleton.getSingleton();

        singleton.doWork();

    }
}
