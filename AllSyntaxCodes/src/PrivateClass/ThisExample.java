package PrivateClass;

public class ThisExample {

        int a;
        int b;

        public void setData(int a, int b){
            this.a=a;
            this.b=b;

        }
    public static void main(String[] args) {
            ThisExample t=new ThisExample();
        t.setData(4,3);

        System.out.println(t.a);
        System.out.println(t.b);
    }
}
