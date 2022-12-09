package Practice;
/*
   Create an Interface 'Shape' with undefined methods as calculateArea and calculatePerimiter. Create 2 classes Circle &
    Square that implements functionality defined in the Shape Interface. Test your code.
   */
public class T1 {
    public static void main(String[] args) {
        Shape [] print={new Circle(7,8,5), new Square(8)};
        for(Shape printA:print){
            printA.calculatePerimiter();
            printA.calculateArea();
        }}}
interface Shape{
    void calculateArea();
    void calculatePerimiter();
}
class Circle implements Shape{
    double length;
    double width;
    double r;
    Circle(double length, double width, double r){
        this.length=length;
        this.width=width;
        this.r=r;
    }
    @Override
    public void calculateArea() {
        System.out.println("the area of circle is "+(length*width));
    }
    @Override
    public void calculatePerimiter() {
        System.out.println("parameter of circle "+(2*Math.PI*r));
    }}
class Square implements Shape{
    int lenght;
    public  Square(int lenght){
        this.lenght=lenght;
    }

    @Override
    public void calculateArea() {
        System.out.println("the area of square is "+(lenght*lenght));
    }
    @Override
    public void calculatePerimiter() {
        System.out.println("the perimiter of square is "+(lenght*4));
    }}
