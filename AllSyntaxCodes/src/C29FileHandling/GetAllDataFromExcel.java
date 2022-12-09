package C29FileHandling;
import Utils.ExcelReader;
import java.io.IOException;

public class GetAllDataFromExcel {
    /*read data from files*/
    public static void main(String[] args) throws IOException {
        String path="C:\\Users\\ryan_\\IdeaProjects\\SDETBatch14Java\\AllSyntaxCodes\\Data\\ExcelTest.xlsx";
        var data=  ExcelReader.read(path);
       /*Map<String ,String> row1=data.get(0);
        System.out.println(row1.get("Name"));*/
              for (var row:data) {//use var instead of Map
            System.out.println(row);
        }
        System.out.println(data);
    }}
