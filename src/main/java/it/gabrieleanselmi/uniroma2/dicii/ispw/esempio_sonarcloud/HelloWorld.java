package it.gabrieleanselmi.uniroma2.dicii.ispw.esempio_sonarcloud;

import java.util.logging.Level;
import java.util.logging.Logger;

public class HelloWorld {
    public static void main (String[] args) {
        Logger logger = Logger.getLogger(HelloWorld.class.getName());
        logger.log(Level.INFO, "Trying SonarCloud!");
    }
}
