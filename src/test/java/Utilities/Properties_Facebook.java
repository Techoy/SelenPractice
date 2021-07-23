package Utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Properties_Facebook {

    public static String getValueFB(String key) throws IOException {
        File file=new File("C:\\Users\\nurik\\SelenPractice1\\src\\test\\resources\\Facebook_Automation");
        FileInputStream inputStream=new FileInputStream(file);
        Properties property= new Properties();
       property.load(inputStream);

        return property.getProperty(key);

    }





}
