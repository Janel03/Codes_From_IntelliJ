package C27CollectionsFramewors;
public abstract class Insurance {
    String insuranceName;
    Insurance(String insuranceName){
        this.insuranceName=insuranceName;
    }
    abstract  void getQuote();
    abstract void cancelInsurance();
    @Override
    public String toString() {
        return super.toString();
    }
}
    class Car extends  Insurance{
    String carModel;
    Car(String insuranceName, String carModel) {
        super(insuranceName);//calls the parent constructor
        this.carModel=carModel;
        }
        @Override
        void getQuote() {
            System.out.println(insuranceName+"charges 3% of the car value for "+carModel);
        }
        @Override
        void cancelInsurance() {
            System.out.println(insuranceName+" has been cancelled");
        }

        @Override
        public String toString() {
            return "Car{" +
                    "carModel='" + carModel + '\'' +
                    ", insuranceName='" + insuranceName + '\'' +
                    '}';
        }}
    class Pet extends Insurance{
        String petType;
        Pet(String insurance, String petType){
            super(insurance);
            this.petType=petType;
        }
        @Override
        void getQuote() {
            System.out.println(insuranceName+" charges $1,500 for "+petType);
        }
        @Override
        void cancelInsurance() {
            System.out.println(insuranceName+" has been canceled for "+petType);
        }
    }
    class Health extends Insurance{
        Health(String insuranceName) {
            super(insuranceName+"charges $2,000 for a check up");
        }
        @Override
        void getQuote() {
        }
        @Override
        void cancelInsurance() {
            System.out.println(insuranceName+"");
        }
        @Override
        public String toString() {
            return super.toString();
        }
    }

