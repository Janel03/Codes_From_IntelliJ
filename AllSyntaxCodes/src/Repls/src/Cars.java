public class Cars {
    String carColor;
    int carYear;
    String carMake;

    void carInfo(){
        System.out.println("Car color is "+ carColor+" and car year is "+ carYear+ " and car model is "+carMake);
    }
    public static void main(String[] args){
        Cars car = new Cars();
        car.carColor = "Black";
        car.carYear = 2019;
        car.carMake = "BMW";
        car.carInfo();

        Cars car1 = new Cars();
        car1.carColor = "White";
        car1.carYear = 2018;
        car1.carMake = "Toyota";

        car1.carInfo();
    }
}


