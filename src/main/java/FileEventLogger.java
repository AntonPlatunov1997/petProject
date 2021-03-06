import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;

public class FileEventLogger implements EventLogger {
    private File file;
    private String fileName;
    public void logEvent(String msg) {

    }

    public void logEvent(Event event) {
        try {
            FileUtils.writeStringToFile(file, event.toString(), true);
        }catch (IOException e){
            e.printStackTrace();
        }
    }

    public void init()throws IOException{
        this.file = new File(fileName);
        if(file.exists()&& !file.canWrite()){
            throw  new IllegalArgumentException("Can't write to file"+ fileName);
        }else if (!file.exists()){
            try {
                file.createNewFile();
            }catch (Exception e){
                throw new IllegalArgumentException("can't create file",e);
            }
        }
    }
}
