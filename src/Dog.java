public class Dog extends Animal {


    public Dog(String name, int age) {
        super(name, "개", age);
        this.name = name;
        this.age = age;

        }

    @Override
    public void makeSound() {
        System.out.println("멍명!");
    }
}
