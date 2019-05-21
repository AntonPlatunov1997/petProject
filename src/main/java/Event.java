import java.text.DateFormat;
import java.util.Date;
import java.util.concurrent.atomic.AtomicInteger;

public class Event {

    private static final AtomicInteger id = new AtomicInteger(0);
    private String msg;
    private Date date;
    private DateFormat dateFormat;


    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Event(Date date, DateFormat df) {
        this.date = date;
        this.dateFormat = df;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Event{");
        sb.append("id=").append(id);
        sb.append(", msg='").append(msg).append('\'');
        sb.append(", date=").append(date);
        sb.append('}');
        sb.append("date format").append(dateFormat.format(date));
        return sb.toString();
    }
}
