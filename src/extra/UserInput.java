package extra;

import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {
        int choice;

        Scanner sc = new Scanner(System.in);

        System.out.println("please enter choice");

        choice = sc.nextInt();

        System.out.println("user choice is: "+choice);
    }
}
