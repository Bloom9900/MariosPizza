package MariosPizza.Model;

import java.text.SimpleDateFormat;

public class Date {

    public static Date getDate() {
        Date date = new Date();
        SimpleDateFormat ft = new SimpleDateFormat("HH:ss");
        return date;
    }

}
