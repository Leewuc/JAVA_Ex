package ch01;

public class PracticeOperatorEx2 {
    public static void main(String args[]){
        int count = 15;
        System.out.println("++count = " + ++count + ", count 값 : " + count );
        System.out.println("count++ = " + count++ + ", count 값 : " + count );
        System.out.println("--count = " + --count + ", count 값 : " + count );
        System.out.println("count-- = " + count-- + ", count 값 : " + count );

        int i = 10;
        int j = 10;
        System.out.println(i++ + ++i);
        System.out.println(j++ + j++);
    }
}
