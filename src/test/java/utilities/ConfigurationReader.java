package utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigurationReader {
    //In this class we will implement repeated steps of reading
    // from configuration.properties file

    //1. Create the object of Properties
    private static Properties properties = new Properties();
    static {
        //2. Get the path and open the file
        try {
            FileInputStream file = new FileInputStream("configuration.properties");

            //3. Load the open file into properties
            properties.load(file);

            //Closing the file in JVM memory
            file.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    //4. Use teh object to read from the configuration.properties file

    public static String getProperty(String keyWord){
        return properties.getProperty(keyWord);
    }

    }


