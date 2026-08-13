public class Bird extends Animal implements Feedable {

    public Bird(String name, int age) {
        super(name, AnimalType.BIRD, age);
        }

    @Override
    public void makeSound() {
        System.out.println("짹짹!");
    }

    @Override
    public void feed(String food) {
        System.out.println(getName() + "에게 먹이를 줍니다: 사료" + food);
    }
}
