interface R174 {

        void method1();
        void method2();
    }
    class MyInt implements R174{
        @Override
        public void method1() {
            System.out.println("implementation of method1");
        }

        @Override
        public void method2() {
            System.out.println("implementation of method2");
        }

    public static void main(String[] args) {
        R174 obj=new MyInt();
        obj.method1();
        obj.method2();
    }}
