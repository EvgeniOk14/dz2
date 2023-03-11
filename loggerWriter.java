import java.io.IOException;
import java.util.logging.*;

public class loggerWriter {

    public static void logWriter(String s) throws IOException 
    {
        Logger logger = Logger.getLogger(functionsFile.class.getName());
        FileHandler fh = new FileHandler("log.txt", true);
        logger.addHandler(fh);
        SimpleFormatter formatter = new SimpleFormatter();
        fh.setFormatter(formatter);

        logger.log(Level.INFO, "element: ");
        logger.log(Level.WARNING, "logger of ");
        logger.info("test ");
        logger.warning("logsPath ");

    }

    

}
