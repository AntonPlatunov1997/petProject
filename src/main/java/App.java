import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    Client client;
    EventLogger eventLogger;
    public void logEvent(String msg){
        String message = msg.replaceAll(client.getId(),client.getFullName());

       eventLogger.logEvent(message);
    }

    public App(Client client, EventLogger eventLogger) {
        this.client = client;
        this.eventLogger = eventLogger;
    }

    public static void main(String[] args) {
 ApplicationContext ctx = new ClassPathXmlApplicationContext("spring.xml");
// App app = (App) ctx.getBean("app");
 App app = ctx.getBean(App.class);


 app.logEvent("Some event for 1");
 app.logEvent("Some event for 2");
    }
}
