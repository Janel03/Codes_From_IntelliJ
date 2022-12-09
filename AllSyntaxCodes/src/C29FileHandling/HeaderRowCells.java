package C29FileHandling;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.LinkedHashMap;

public class HeaderRowCells {
    public static void main(String[] args) throws IOException {
        //Location of the file where your HardsDrive file is stored
        String path="C:\\Users\\ryan_\\IdeaProjects\\SDETBatch14Java\\AllSyntaxCodes\\Data\\ExcelTest.xlsx";
        //Reads the data from HardDrive & brings it to RAM in the raw form 101010101010
        //in simple words: computer has navigated to that file
        FileInputStream fis=new FileInputStream(path);
        //this class converts the raw bytes to Excel format
        //simple: it  is a special software that helps us to read & write data to an Excel file
        XSSFWorkbook excel=new XSSFWorkbook(fis);
        Sheet sheet=excel.getSheet("Sheet1");
        int noOfRow=sheet.getPhysicalNumberOfRows();
        //create a map,get Header Row/top row to use as keys for our map
        Row headerRow=sheet.getRow(0);
        //the Map that will store data for each row
        LinkedHashMap<String, String> rowMap=new LinkedHashMap<>();
        // A loop that goes through all the rows that contain the data
        for (int rowNo = 1; rowNo < noOfRow; rowNo++) {
            Row dataRow= sheet.getRow(rowNo);//get a row from sheet one by one
            //find how many cells are there
            int noOfCells=dataRow.getPhysicalNumberOfCells();
            // A loop to go through all the cells
            for (int cellNo = 0; cellNo < noOfCells; cellNo++) {
                //get keys from header row & values from data row
        //convert the Cells toString
                rowMap.put(headerRow.getCell(cellNo).toString(),dataRow.getCell(cellNo).toString());
            }
            System.out.println(rowMap);
        }}}
