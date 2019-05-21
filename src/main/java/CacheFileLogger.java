import java.util.ArrayList;
import java.util.List;

public class CacheFileLogger extends FileEventLogger {
    private int cacheSize;
    private List<Event> cache;
    private FileEventLogger fileEventLogger;

    public CacheFileLogger(String filename, int cacheSize) {
        super(filename);
        this.cacheSize = cacheSize;
        this.cache = new ArrayList<Event>(cacheSize);
    }

    @Override
    public void logEvent(Event event) {
        cache.add(event);

        if (cache.size() == cacheSize) {
            writeEventsFromCache();
            cache.clear();
        }
    }

    public void writeEventsFromCache() {
        for (Event event : cache) {
            fileEventLogger.logEvent(event);
        }
    }

    public void destroy() {
        if (!cache.isEmpty()) {
            writeEventsFromCache();
        }
    }
}
