
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.util.Calendar;
public class datetimechecker {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String month = in.next();
        String day = in.next();
        String year = in.next();
        Calendar c1 = Calendar.getInstance();
        int dd = Integer.parseInt(day);
        int mm = Integer.parseInt(month);
        int yyyy = Integer.parseInt(year);
        c1.set(Calendar.YEAR,yyyy);
        c1.set(Calendar.MONTH,mm-1);
        c1.set(Calendar.DATE,dd);
        System.out.println(c1.get(Calendar.DAY_OF_WEEK));
        
        
    }
}

