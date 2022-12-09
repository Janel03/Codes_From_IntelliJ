package C24Incapsulation;

public class Horse {
   private String name;
   private String breed;
   private String color;
   private int age;

    public Horse(String name, String breed, String color, int age) {
        setName(name);
        setBreed(breed);
        setColor(color);
        setAge(age);
    }
    public String getName(String name) {
        if (name.equals("Josh")){
            return "Not allowed";
        }else{
            return name;
        }}
    public void setName(String name) {
        if (name.isEmpty()){
            System.out.println("Really?! your horse is nameless?");
        }else {
            this.name = name;
        }}
    public String getBreed() {
        return breed;
    }
    public void setBreed(String breed) {
        if (breed.isEmpty()){
            System.out.println("Really?! you dont know your horse's breed?");
        }else {
            this.breed = breed;
        }}
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        if (color.isEmpty()){
            System.out.println("Are you color blind?");
        }else{
            this.color = color;
        }}
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        if (age<0){
            System.out.println("For real? You dont know the age of your horse?");
        }else {
            this.age = age;
        }

    }
}
