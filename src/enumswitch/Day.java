package enumswitch;

public class Day {

    public void whichDay(Week week){
        switch (week){
            case MONDAY:
                System.out.println("first day of the week");
                break;
            case TUESDAY:
                System.out.println("read book");
                break;
            case WEDNESDAY:
                System.out.println("do homework");
                break;
            case THURSDAY:
                System.out.println("workout");
                break;
            case FRIDAY:
                System.out.println("class review");
                break;
            case SATURDAY:
                System.out.println("watch game");
                break;
            case SUNDAY:
                System.out.println("rest");
                break;
//            default:
//                System.out.println("invalid entry");
        }
    }
}
