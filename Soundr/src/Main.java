class Box{

    int length;
    int breadth;
    int height;
}
public class Main {
    public static void main(String[] args) {
        Box square;
        square=new Box();
        Box rectangle;

        rectangle=new Box();
        square.length=5;
        square.breadth=12;
        rectangle.length=65;
        rectangle.breadth=33;

        System.out.println("area of square is: "+square.length*square.length);
        System.out.println("area of rectangle is: "+rectangle.length*rectangle.breadth);
        System.out.println("perimeter of rectangle is : "+2*(rectangle.length+rectangle.breadth));

    }}