package ch01;

public class PracticeOperatorEx11 {
    public static void main(String[] args) {
        // 단항 연산자
        int a = 10;
        int b = -a;
        boolean flag = true;
        flag = !flag;
        System.out.println("a: " + a); // 10
        System.out.println("b: " + b); // -10
        System.out.println("flag: " + flag); // false

        // 이항 연산자
        int x = 15;
        int y = 4;
        System.out.println("x + y: " + (x + y)); // 19
        System.out.println("x - y: " + (x - y)); // 11
        System.out.println("x * y: " + (x * y)); // 60
        System.out.println("x / y: " + (x / y)); // 3
        System.out.println("x % y: " + (x % y)); // 3

        // 비교 연산자
        System.out.println("x == y: " + (x == y)); // false
        System.out.println("x != y: " + (x != y)); // true
        System.out.println("x > y: " + (x > y)); // true
        System.out.println("x < y: " + (x < y)); // false
        System.out.println("x >= y: " + (x >= y)); // true
        System.out.println("x <= y: " + (x <= y)); // false

        // 논리 연산자
        boolean p = true;
        boolean q = false;
        System.out.println("p && q: " + (p && q)); // false
        System.out.println("p || q: " + (p || q)); // true
        System.out.println("p & q: " + (p & q)); // false
        System.out.println("p | q: " + (p | q)); // true
        System.out.println("p ^ q: " + (p ^ q)); // true

        // 삼항 연산자
        int max = (x > y) ? x : y;
        System.out.println("max: " + max); // 15
    }
}
