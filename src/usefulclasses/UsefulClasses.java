package usefulclasses;

import java.text.SimpleDateFormat;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UsefulClasses {
    public static void main(String[] args) {
        //regex in java (Pattern class & Matcher class)

        // String to be scanned to find the pattern.
        String str = "my_email@domain-name.com";
        String pattern = "^[A-Za-z0-9+_.-]{6,25}@[A-Za-z0-9+.-]+\\.[A-Za-z]{2,4}$";

        // Create a Pattern object
        Pattern r = Pattern.compile(pattern);

        // Now create matcher object.
        Matcher m = r.matcher(str);
        System.out.println(m.matches());

        //Calendar (Calendar class)
        Calendar c = Calendar.getInstance();
        System.out.println("The Current complete Date is:" + c.getTime());
        System.out.println("The Current Date is:" + c.get(Calendar.DATE));
        System.out.println("The Current minute is:" + c.get(Calendar.MINUTE));
        System.out.println("The Current second is:" + c.get(Calendar.SECOND));


        //day class & SimpleDateFormat
        // Instantiate a Date object
        Date date = new Date();

        // display time and date using toString()
        System.out.println(date.toString());

        Date dNow = new Date( );
        SimpleDateFormat ft = new SimpleDateFormat ("dd MM yyyy");

        System.out.println("Current Date: " + ft.format(dNow));

        /*
        Pattern                             Example
        dd-MM-yy                            31-01-12
        dd-MM-yyyy	                        31-01-2012
        MM-dd-yyyy	                        01-31-2012
        yyyy-MM-dd	                        2012-01-31
        yyyy-MM-dd HH:mm:ss	                2012-01-31 23:59:59
        yyyy-MM-dd HH:mm:ss.SSS	            2012-01-31 23:59:59.999
        yyyy-MM-dd HH:mm:ss.SSSZ	        2012-01-31 23:59:59.999+0100
        EEEEE MMMMM yyyy HH:mm:ss.SSSZ	    Saturday November 2012 10:45:42.720+0100
        */

        /*
        G	Era designator (before christ, after christ)
        y	Year (e.g. 12 or 2012). Use either yy or yyyy.
                M	Month in year. Number of M's determine length of format (e.g. MM, MMM or MMMMM)
        d	Day in month. Number of d's determine length of format (e.g. d or dd)
        h	Hour of day, 1-12 (AM / PM) (normally hh)
        H	Hour of day, 0-23 (normally HH)
        m	Minute in hour, 0-59 (normally mm)
        s	Second in minute, 0-59 (normally ss)
        S	Millisecond in second, 0-999 (normally SSS)
        E	Day in week (e.g Monday, Tuesday etc.)
        D	Day in year (1-366)
        F	Day of week in month (e.g. 1st Thursday of December)
        w	Week in year (1-53)
        W	Week in month (0-5)
        a	AM / PM marker
        k	Hour in day (1-24, unlike HH's 0-23)
        K	Hour in day, AM / PM (0-11)
        z	Time Zone
        '	Escape for text delimiter
        '
        */

        //Scanner class
        Scanner sc = new Scanner(System.in);
        //String name = sc.nextLine();
        //System.out.println("Hello, "+name);

        //Random class
        Random random = new Random();
        int[] array = new int[5];
        for(int i=0; i<array.length; i++){
            array[i] = random.nextInt(100);
        }
        for(int i=0; i<array.length; i++){
            System.out.println(array[i]);
        }

        //StringBuffer class & StringBuilder class
        StringBuffer buffer=new StringBuffer("hello");
        buffer.append(" java");
        System.out.println(buffer);

        StringBuilder builder=new StringBuilder("hello");
        //builder.append("java");
        builder.reverse();
        builder.append(" java");
        System.out.println(builder);

        //Iterator class
        List<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(4);
        list.add(6);
        Iterator<Integer> iterator =  list.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }

}
