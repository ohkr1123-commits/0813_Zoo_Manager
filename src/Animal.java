public class Animal {

    //필드
    static String name;
    static String species;
    static int age;

    //생성자
    public Animal(String name, String species, int age) {
        this.name = name;
        this.species = species;
        this.age =  age;
    }

    //매서드
    public static void introduce() {
        System.out.println("저는 " + name + "입니다. " + "종류는 " + species + "이고 나이는 " + age + "입니다.");
    }

}
