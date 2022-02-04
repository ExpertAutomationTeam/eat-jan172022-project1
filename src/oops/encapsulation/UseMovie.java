package oops.encapsulation;

public class UseMovie {
    public static void main(String[] args) {

        Movie lordOfRings = new Movie();

        lordOfRings.setRating("dog");
        lordOfRings.setTitle("lord of rings");

        System.out.println(lordOfRings.getTitle());
        System.out.println(lordOfRings.getRating());



    }
}
