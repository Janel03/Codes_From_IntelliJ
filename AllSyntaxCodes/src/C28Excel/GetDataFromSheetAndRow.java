package C28Excel;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import java.io.FileInputStream;
import java.io.IOException;

public class GetDataFromSheetAndRow {
    public static void main(String[] args) throws IOException {
        //need to know the path of the file
    String path="C:\\Users\\ryan_\\IdeaProjects\\SDETBatch14Java\\AllSyntaxCodes\\Data\\ExcelTest.xlsx";
    //navigate to the folder & open the file
        FileInputStream fileInputStream=new FileInputStream(path);
        //that special that can handle the xlsx files
        XSSFWorkbook excelFile=new XSSFWorkbook(fileInputStream);
        //navigate to Sheet inside Excel File
        Sheet sheet=excelFile.getSheet("Sheet1");
        // get the Row that contains the data, rows are index based,will start from zero
        Row row0=sheet.getRow(0);
        System.out.println(row0.getCell(0));//prints the FirstName
        //get the data from row 1
        Row row1=sheet.getRow(1);
        System.out.println(row1.getCell(0));//prints Janel
    }}
