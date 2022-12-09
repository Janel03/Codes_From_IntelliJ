package C28Excel;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import java.io.FileInputStream;
import java.io.IOException;

public class GetAllDataFromExcel {
    public static void main(String[] args) throws IOException {
        //find the path
        String path="C:\\Users\\ryan_\\IdeaProjects\\SDETBatch14Java\\AllSyntaxCodes\\Data\\ExcelTest.xlsx";
        FileInputStream fileInputStream=new FileInputStream(path);
        //locate the excel
        XSSFWorkbook excel=new XSSFWorkbook(fileInputStream);
        //locate the sheet
        Sheet sheet=excel.getSheet("Sheet1");
        //get the number of rows that contains data in the sheet
        int noOfRows=sheet.getPhysicalNumberOfRows();
        //System.out.println(noOfRows);//print the number of rows
        for (int i = 0; i < noOfRows; i++) {
            Row row=sheet.getRow(i);//number of rows
            //returns the total number of cells that contains data
            int noOfCell=row.getPhysicalNumberOfCells();
            for (int j = 0; j < noOfCell; j++) {
                Cell cell= row.getCell(j);
                //System.out.println(cell);//will print in new line each data
                System.out.print(cell+" ");//print in 1 line with space
            }
            System.out.println();//add this to print each Row in a separate line
        }}}
