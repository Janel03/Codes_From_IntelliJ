package Cl23AbstractNinterface;

public class HW1Tester {
    public static void main(String[] args) {
      HW1[] hw1={new JavaFile(),new WordFile(),new PdfFile()};
      for (HW1 files: hw1){
          files.open();
      }



       /* HW1 file=new PdfFile();
        file.close();
        file.edit();
        file.open();*/
    }
}
