public class Dog extends Animal implements Trainable, Feedable {


    public Dog(String name, int age) {
        super(name, AnimalType.DOG, age);
        }

    @Override
    public void makeSound() {
        System.out.println("멍명!");
    }

    @Override
    public void train() {
        System.out.println(getName() + "훈련을 시작합니다. 앉아!");
    }

    @Override
    public void feed(String food) {
        System.out.println(getName() + "에게 먹이를 줍니다: 사료" + food);
    }
}
