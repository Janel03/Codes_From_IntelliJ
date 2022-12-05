

interface Outputs{
    default void display(double result){
    }
    interface Functions {
        public double adding(double firstNumber, double SecondNumber);
        public double subtracting(double firstNumber, double SecondNumber);
        public double multiply(double firstNumber, double SecondNumber);
        public double divide(double firstNumber, double SecondNumber);
    }

    class Main implements Functions{
        public static void main(String[] args) {
            Main print=new Main();
            print.display(print.adding(70,50));
            print.display(print.subtracting(180,100));
            print.display(print.multiply(200,10));
            print.display(print.divide(25,5));

        }
        public double adding(double firstNumber, double SecondNumber){
            return firstNumber+SecondNumber;
        }
        public double subtracting(double firstNumber, double SecondNumber){
            return firstNumber-SecondNumber;
        }
        public double multiply(double firstNumber, double SecondNumber){
            return firstNumber*SecondNumber;
        }
        public double divide(double firstNumber, double SecondNumber){
            return firstNumber/SecondNumber;
        }
        public void display (double result){
            System.out.println("Result is ::: "+result);
        }
    }}
