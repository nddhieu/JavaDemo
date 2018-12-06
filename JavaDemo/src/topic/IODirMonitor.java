package topic;
import java.io.IOException;
import java.nio.file.*;
import java.util.Map;

import static java.nio.file.StandardWatchEventKinds.ENTRY_CREATE;
import static java.nio.file.StandardWatchEventKinds.ENTRY_DELETE;
import static java.nio.file.StandardWatchEventKinds.ENTRY_MODIFY;

//this class create watch event on the folder C:\\temp
//it will record the event happen in this folder as create, delete, modify

/**
 * @author nddhieu
 * @version
 * @see [Parent Class]
 *
 */
public class IODirMonitor {
    private Path path = null;
    private WatchService watchService = null;

    public void init(){
        path = Paths.get("C:\\temp");
        try{
            watchService = FileSystems.getDefault().newWatchService();
            path.register(watchService, ENTRY_CREATE,ENTRY_DELETE, ENTRY_MODIFY);

        }
        catch (IOException e){
            System.out.println("IOException " + e.getMessage());
        }
    }
    public void doRounds(){
        WatchKey key = null;
        while (true){
            try {
                key = watchService.take();
                for ( WatchEvent<?> event : key.pollEvents()){
                    WatchEvent.Kind<?> kind = event.kind();
                    System.out.println("Event on " + event.context().toString() + event.kind() );
                }
            }
            catch (InterruptedException e){
                System.out.println("IOException " + e.getMessage());
            }
            boolean reset = key.reset();
            if  (!reset){
                break;
            }
        }
    }
}
