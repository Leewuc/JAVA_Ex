package ch01.inofpattmatch;

class Animal {
    void makeSound() {
        System.out.println("동물 소리");
    }
}

class Dog extends Animal {
    @Override
    void makeSound() {
        System.out.println("멍멍");
    }

    void fetch() {
        System.out.println("개가 공을 가져온다");
    }
}

class Cat extends Animal {
    @Override
    void makeSound() {
        System.out.println("야옹");
    }

    void scratch() {
        System.out.println("고양이가 긁는다");
    }
}

public class InstanceofPatternMatchingEx01 {
    public static void main(String[] args) {
        Animal animal1 = new Dog();
        Animal animal2 = new Cat();
        Animal animal3 = null;

        // instanceof 연산자와 패턴 매칭을 사용한 타입 검사
        // animal1이 Dog 클래스의 인스턴스인지 검사하면서 형변환 수행
        if (animal1 instanceof Dog dog) {
            dog.makeSound(); // 출력: Bark
            dog.fetch();     // 출력: Dog fetches the ball.
        }

        if (animal2 instanceof Cat cat) {
            cat.makeSound(); // 출력: Meow
            cat.scratch();   // 출력: Cat scratches.
        }

        // null 체크
        if (animal3 instanceof Animal) {
            System.out.println("animal3는 Animal의 인스턴스 입니다");
        } else {
            System.out.println("animal3는 Animal의 인스턴스가 아닙니다");
        }
    }
}