public class ArrayDemo {
    public static void main(String[] args) {
        String[] country={"USA","Japan","Mexico","Canada","South Africa", "Australia"};

        String store="";
        int max=0;

        for (String s : country) { //enhanced for loop
            if (s.length() > max) {
                max = s.length();
                store = s;
            }}
        System.out.println(store);
    }}
/*
 for(int i=0; i<country.length; i++){
            if(country[i].length()>max){
                max=country[i].length();
                store=country[i];
 */