public class Degree {
    /*
Create a class 'Degree' having a method 'getPrerequisite' that prints ""To get a degree you need high school diploma"".
Class 'Degree' has 2 subclasses namely 'Bachelors' and Masters’. In Masters class override method 'getPrerequisite'.
Call the method by creating an object of each of the three classes.
    */
    public void getPrerequisite() {//getPrereq = method
        System.out.println("To get a degree you need high school diploma");
    }
    static class Bachelors extends Degree {
    }
    static class Masters extends Degree {
        @Override
        public void getPrerequisite() {
            super.getPrerequisite();
        }}}
 class Main{
     public static void main(String[] args) {
         Degree deg=new Degree();
         Degree.Bachelors bach=new Degree.Bachelors();
         Degree.Masters mas=new Degree.Masters();
         deg.getPrerequisite();
         bach.getPrerequisite();
         mas.getPrerequisite();
     }}



