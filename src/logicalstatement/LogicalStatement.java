package logicalstatement;

public class LogicalStatement {
    public static void main(String[] args) {
        int num = 0;

        //if else if else statement
        if (num > 0){
            System.out.println("this number is positive");
        }else if (num == 0){
            System.out.println("this number equals to 0");
        } else{
            System.out.println("this number is negative");
        }

        //logical operator: ==, !=, >, <, >=, <=, +, -, /, *, %, &, &&, |, ||

        int a = 6;
        if(a % 2 == 0){
            System.out.println("this number is even");
        }else{
            System.out.println("this number is odd");
        }
    }
}
