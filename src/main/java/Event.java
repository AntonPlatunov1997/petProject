import java.util.Date;

public class Event {
    private int id;
    private String msg;
    private Date date;

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Event(Date date) {
        this.date = date;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Event{");
        sb.append("id=").append(id);
        sb.append(", msg='").append(msg).append('\'');
        sb.append(", date=").append(date);
        sb.append('}');
        return sb.toString();
    }
}
