package entities;

import org.springframework.stereotype.Component;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.atomic.AtomicInteger;


@Component
public class Event {

    private static final AtomicInteger id = new AtomicInteger(0);
    private String msg;
    private Date date;
    private DateFormat dateFormat;


    public void setMsg(String msg) {
        this.msg = msg;
    }

    public static boolean isDay() {
        Date date = new Date();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("HH");
        Integer time = Integer.valueOf(simpleDateFormat.format(date));

        if (8<time&& time<17){
            return true;
        }else{
            return false;
        }
    }

    public Event() {
    }

    public Event(Date date, DateFormat df) {
        this.date = date;
        this.dateFormat = df;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("entities.Event{");
        sb.append("id=").append(id);
        sb.append(", msg='").append(msg).append('\'');
        sb.append(", date=").append(date);
        sb.append('}');
        sb.append("date format").append(dateFormat.format(date));
        return sb.toString();
    }
}
