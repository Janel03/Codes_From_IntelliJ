package C29FileHandling;
import Utils.ExcelReader;
import java.io.IOException;
/*read data from Utils package
This is a method to read the code from another class
*/
public class CallExcelReader {
    public static void main(String[] args) throws IOException {
        var excelData=ExcelReader.read("C:\\Users\\ryan_\\IdeaProjects\\SDETBatch14Java\\AllSyntaxCodes\\Data\\ExcelTest.xlsx");
        System.out.println(excelData);
    }}
