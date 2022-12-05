
class Main extends ChildInterface{

}
class ParentInterface{
    void parentMethod(){

    }
}
class ChildInterface extends ParentInterface {
    void parentMethod(){

    }


    public static void main(String[] args) {
        ParentInterface parent=new ParentInterface();
        parent.parentMethod();
        System.out.println("Parent Method-welcome to Syntax");

        ChildInterface child=new ChildInterface();
        child.parentMethod();
        System.out.println("Child Method-hello Syntax");

    }}
