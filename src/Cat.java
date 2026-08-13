public class Cat extends Animal {

    public Cat(String name, int age) {
        super(name, "고양이", age);
        this.name = name;
        this.age = age;

        }

    @Override
    public void makeSound() {
        System.out.println("야옹~");
    }
}
