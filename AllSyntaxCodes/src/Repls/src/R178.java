public class R178 {
    private String empName;
    private int empAge;

    public String getEmpName() {
        return empName;
    }
    public void setEmpName(String empName) {
        this.empName = empName;
    }
    public int getEmpAge() {
        return empAge;
    }
    public void setEmpAge(int empAge) {
        this.empAge = empAge;
    }
    public R178(String empName, int empAge) {
        this.empName = empName;
        this.empAge = empAge;
    }
    public static void main(String[] args) {
        R178 print=new R178("John",30);
        System.out.println("Employee Name: "+print.empName);
        System.out.println("Employee Age: "+print.empAge);
    }
}
