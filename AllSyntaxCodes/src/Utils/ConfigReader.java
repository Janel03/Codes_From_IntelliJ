package Utils;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
/*need this method everytime I need to read properties> the Key Value pairs from the properties
*/
public class ConfigReader {
    public static Properties read(String path) throws IOException {

        var fileInputStream=new FileInputStream(path);//Navigate to the file
        var properties=new Properties();//property class>special software that helps to read data from that file
        properties.load(fileInputStream);//loads all the data from the file inside(Memory) java code()
        return properties;
    }
}
