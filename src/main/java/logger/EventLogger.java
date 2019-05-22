package logger;

import entities.Event;

public interface EventLogger {
    void logEvent(String msg);
    void logEvent(Event event);
}
