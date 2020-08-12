import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import java.lang.*;
import java.time.LocalDateTime;

public class App {

    private static final Logger log = LogManager.getLogger(App.class);

    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            log.info("I AM RUNNING FROM THE JAVA APP. The time is {}", LocalDateTime.now());
            try {
                Thread.sleep(60000);
             } catch (Exception e) {
                log.error(e);
             }
        }
    }
}
