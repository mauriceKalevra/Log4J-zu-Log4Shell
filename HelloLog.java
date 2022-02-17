import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.Level;

public class HelloLog {

    private static final Logger logger = LogManager.getLogger();
    public static void main(String[] args) {
        //Hallo Albstadt
        String workingdir = "${env:HOME}";
        logger.info("Hello Albstadt" + workingdir);
    }
}