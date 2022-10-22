public class R124Print3Ways {
    void  print3Ways(){//will only print stored string in sysout

        System.out.println("Welcome To Syntax Technologies");

    }
    void printThis(String word){//will print any string on main
        System.out.println(word);
    }
    public static void main(String[] args) {
        R124Print3Ways ss=new R124Print3Ways();
        ss.print3Ways();
        ss.printThis("Welcome To Syntax Technologies");
        ss.printThis("Welcome To Syntax Technologies");
}}
