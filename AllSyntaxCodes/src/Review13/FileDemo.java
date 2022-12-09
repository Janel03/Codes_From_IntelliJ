package Review13;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
//build a method to read data from properties file
//it should be available to any other class in project
//& once the key is passed, it should give its value
public class FileDemo {
    public static void main(String[] args) throws IOException {
        System.out.println(getProperty("password"));
    }
    //write all this code, then call with method above to access from anywhere
    public static String getProperty(String key) throws IOException {
        String path="C:\\Users\\ryan_\\IdeaProjects\\SDETBatch14Java\\AllSyntaxCodes\\Data\\config.properties";
        FileInputStream fis=new FileInputStream(path);
        Properties properties=new Properties();
        properties.load(fis);
        return properties.getProperty(key);
    }}
