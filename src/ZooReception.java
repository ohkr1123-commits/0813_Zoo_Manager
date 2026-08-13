import java.util.Scanner;

public class ZooReception {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = null;
        String species = null;
        int age = 0;
        boolean registered = false;
        boolean running = true;   // 반복문 종료를 제어하는 플래그

        while (running) {
            System.out.println("===== 동물원 접수 =====");
            System.out.println("1. 동물 등록");
            System.out.println("2. 동물 정보 보기");
            System.out.println("0. 종료");
            System.out.print("선택> ");

            int choice = sc.nextInt();
            sc.nextLine(); // 개행 문자 처리

            switch (choice) {
                case 1:
                    System.out.print("동물 이름: ");
                    name = sc.nextLine();
                    System.out.print("동물 종류: ");
                    species = sc.nextLine();
                    System.out.print("동물 나이: ");
                    age = sc.nextInt();
                    sc.nextLine();

                    registered = true;
                    System.out.println("동물이 등록되었습니다.");
                    break;
                case 2:
                    if (registered) {
                        System.out.println("동물 이름: " + name);
                        System.out.println("동물 종류: " + species);
                        System.out.println("동물 나이: " + age);
                    } else {
                        System.out.println("동물에 대한 정보가 없습니다.");
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