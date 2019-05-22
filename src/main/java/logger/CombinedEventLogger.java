package logger;

import entities.Event;

import java.util.Collection;
import java.util.List;

public class CombinedEventLogger implements EventLogger {
    private Collection<EventLogger> loggers;

    public CombinedEventLogger(Collection<EventLogger> loggers) {
        super();
        this.loggers = loggers;
    }

    public void logEvent(String msg) {

    }

    public void logEvent(Event event) {
      for (EventLogger logger:loggers){
          logger.logEvent(event);
      }


    }
}
