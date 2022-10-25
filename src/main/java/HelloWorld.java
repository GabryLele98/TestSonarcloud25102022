import java.util.logging.Level;
import java.util.logging.Logger;

public class HelloWorld {
    public static void main (String[] args) {
        //System.out.println("Hello World!\nI'm trying SonarCloud!");
        Logger logger = Logger.getLogger(HelloWorld.class.getName());
        logger.log(Level.INFO, "Hello World!\nI'm trying SonarCloud!");
    }
}
