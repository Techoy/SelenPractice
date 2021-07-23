package Utilities;



import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropertiesFilesIntro {

    private final static Logger LOG= LoggerFactory.getLogger(PropertiesFilesIntro.class);

    public static String getValue(String key) throws IOException {
        File file=new File("C:\\Users\\nurik\\SelenPractice1\\src\\test\\resources\\credentials.properties");
        FileInputStream inputStream=new FileInputStream(file);// it is streamed data from the file
        Properties properties=new Properties();
        properties.load(inputStream);


        return properties.getProperty(key);
    }

    public static void main(String[] args) throws IOException {
        //getValue("");
        LOG.trace("Logging trace level");
        LOG.debug("Logging DEBUG level");
        LOG.info("Logging INFO level");
        LOG.warn("Logging WARN level");
        LOG.error("Logging ERROR level");
    }
}
/**
 *
 * login to Instragram, Facebook, and click fiive likes
 */
