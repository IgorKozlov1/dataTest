import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DataOne {

    public static void main(String[] args) {
        SimpleDateFormat dateFormat= new SimpleDateFormat("yyy.MMMM.dd 'at' HH:mm:ss z");
        System.out.println("date: "+dateFormat.format(new Date()));
        Date d1=new Date();
        Date d2=new Date();
        System.out.println(d1.getTime()>d2.getTime());

        Calendar c1=Calendar.getInstance();
        System.out.println(Calendar.getInstance());
    }

}
