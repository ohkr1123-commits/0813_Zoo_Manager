import java.util.Scanner;

public class ZooReception {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Animal[] zoo = new Animal[10];
        String name = null;
        String species = null;
        int age = 0;
        int count = 0;
        boolean registered = false;
        boolean running = true;   // 반복문 종료를 제어하는 플래그

        while (running) {
            System.out.println("===== 동물원 접수 =====");
            System.out.println("1. 동물 등록");
            System.out.println("2. 동물 정보 보기");
            System.out.println("3. 훈련 가능한 동물 훈련하기");
            System.out.println("4. 먹이주기");
            System.out.println("0. 종료");
            System.out.print("선택> ");

            int choice = sc.nextInt();
            sc.nextLine(); // 개행 문자 처리

            switch (choice) {
                case 1:
                    if (count == zoo.length) {
                        System.out.println("더 이상 등록할 수 없습니다");
                        break;
                    }
                    System.out.print("동물 이름: ");
                    name = sc.nextLine();
                    System.out.print("동물 나이: ");
                    age = sc.nextInt();
                    sc.nextLine();

                    System.out.println("아래에서 동물 종류 선택> ");
                    System.out.println("1. 개");
                    System.out.println("2. 고양이");
                    System.out.println("3. 새");

                    int animalType = sc.nextInt();
                    sc.nextLine();

                    Animal animal = null;
                    switch (animalType) {
                        case 1:
                            zoo[count] = new Dog(name, age);
                            break;
                        case 2:
                            zoo[count] = new Cat(name, age);
                            break;
                        case 3:
                            zoo[count] = new Bird(name, age);
                            break;
                        default:
                            System.out.println("잘못된 동물 종류 입니다.");
                    }

                    registered = true;
                    zoo[count++] = animal;
                    System.out.println("동물이 등록되었습니다.");
                    break;
                case 2:
                    for (int i = 0; i < count; i++) {
                        zoo[i].introduce();
                        zoo[i].makeSound();
                    }
                    break;
                case 3: //훈련 가능한 동물만 훈련시키기
                    System.out.print("훈련> ");
                    String train = sc.nextLine();
                    for (int i = 0; i < count; i++) {
                        if (zoo[i] instanceof Trainable) {
                            ((Trainable) zoo[i]).train();
                            }
                    }
                    break;
                case 4: //먹이주기
                    System.out.print("먹이> ");
                    String food = sc.nextLine();
                    for (int i = 0; i < count; i++) {
                        if (zoo[i] instanceof Feedable) {
                            ((Feedable) zoo[i]).feed(food);
                        }
                    }
                    break;
                case 0:
                    System.out.println("프로그램을 종료합니다");
                    running = false;
                    break;
                default:
                    System.out.println("잘못된 입력입니다. 다시 선택하세요.");

            }
        }
    }
}