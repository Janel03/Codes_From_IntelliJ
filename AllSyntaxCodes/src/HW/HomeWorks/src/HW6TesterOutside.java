public class HW6TesterOutside {
    /*
    Write a java class that has 4 constructors with 4 different access levels of constructors(private,public,default,protected)
     and create 4 objects of this class: 1 - inside same class; 2 - from outside the class;
     3 - from different class inside different package  and observe result.
    */
    public static void main(String[] args) {

        HW6 people=new HW6(25);
        System.out.println(people.ageInfo());
        //another way to convert the age on line 3 to string
        String result=people.ageInfo();
        System.out.println(result);
    }
}
