package ch01.inheritance;
class Animal {
    String name;

    void eat() {
        System.out.println(name + "이(가) 먹고 있습니다.");
    }
}

// 자식 클래스 정의 (Animal 클래스를 상속)
class Dog extends Animal {
    void bark() {
        System.out.println(name + "이(가) 짖고 있습니다.");
    }
}

public class PracticeInheritanceExample {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.name = "바둑이";
        dog.eat();  // 부모 클래스의 메서드 호출
        dog.bark(); // 자식 클래스의 메서드 호출
    }
}
