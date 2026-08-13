public class Animal {

    //필드
    private String name;
    private AnimalType type;
    private int age;
    private HealthStatus healthStatus = HealthStatus.GOOD;

    //생성자
    public Animal(String name, AnimalType type, int age) {
        this.name = name;
        this.type = type;
        if (age < 0) {
            System.out.println("나이는 음수가 될 수 없습니다. 0으로 보정합니다.");
            this.age = 0;
        } else {
            this.age = age;
        }
    }
    public String getName() { return name;
    }
    public AnimalType gettype() { return type;
    }
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age < 0) {
            System.out.println("나이는 음수일 수 없습니다.");
            return;
        } else {
            this.age = age;
        }
    }

    public HealthStatus getHealthStatus() {
        return healthStatus;
    }

    public void setHealthStatus(HealthStatus healthStatus) {
        this.healthStatus = healthStatus;
    }


    //매서드
    public void introduce() {
        System.out.println("저는 " + getName() + "입니다. " + "종류는 " + gettype().getDisplayName() + "이고 나이는 " + getAge() + "입니다.");
    }



    public void makeSound() {
        System.out.println("...");

    }

}
