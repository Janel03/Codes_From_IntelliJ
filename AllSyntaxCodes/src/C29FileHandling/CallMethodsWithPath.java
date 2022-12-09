package C29FileHandling;
import Utils.ConfigReader;
import Utils.ExcelReader;
import java.io.IOException;
//FilesDemo
public class CallMethodsWithPath {
    public static void main(String[] args) throws IOException {
        //if I need to read properties from config.properties, I only need the path & just call that method
    String path="C:\\Users\\ryan_\\IdeaProjects\\SDETBatch14Java\\AllSyntaxCodes\\Data\\config.properties";
        var properties=ConfigReader.read(path);
        System.out.println(properties.getProperty("browser"));
//if I need to read properties of Excel, just grab the path & call that method
        String excelPath="C:\\Users\\ryan_\\IdeaProjects\\SDETBatch14Java\\AllSyntaxCodes\\Data\\ExcelTest.xlsx";
        var excelData=ExcelReader.read(excelPath);
        System.out.println(excelData);
    }}
