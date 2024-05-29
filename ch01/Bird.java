package ch01.flyerinf;

import ch10.Animal;

public class Bird extends Animal implements Flyer {

    @Override
    public void takeOff() { // intefrace implements
        System.out.println("새가 이륙하다");
    }
    @Override
    public void land() { // intefrace implements
        System.out.println("새가 착륙하다");
    }
    @Override
    public void fly() { // intefrace implements
        System.out.println("새가 날다");
    }
    public void buildNest() {
        System.out.println("새가 둥지를 짓다");
    }
    public void layEggs() {
        System.out.println("새가 알을 낳다");
    }
    public void eat() { // Animal eat() override
        System.out.println("새가 먹는다");
    }
}