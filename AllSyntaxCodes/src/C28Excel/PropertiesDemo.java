package C28Excel;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesDemo {
    public static void main(String[] args) throws IOException {
    var path="C:\\Users\\ryan_\\IdeaProjects\\SDETBatch14Java\\AllSyntaxCodes\\Data\\config.properties";//location of the file
        var fileInputStream=new FileInputStream(path);//Navigate to the file
    var properties=new Properties();//property class>special software that helps to read data from that file
    properties.load(fileInputStream);//loads all the data from the file inside(Memory) java code()
        System.out.println(properties.getProperty("URL"));
        //will print the value of the key=FB.com
        System.out.println("password");
        fileInputStream.close();

    }
}
