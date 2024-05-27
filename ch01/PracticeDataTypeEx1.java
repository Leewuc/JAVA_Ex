package ch01;

public class PracticeDataTypeEx1 {
    public static void main(String args[]){
        char c = 'M';
        byte b1 = -128;
        byte b2 = 127;
        int i1 = -2147483648;
        int i2 = 214783647;
        short s1 = -32768;
        short s2 = 32767;
        long l2 = 9223372036854775807L;
        long l1 = -9223372036854775808L;

        float f = 3.41f;
        double d = 4.37346473;

        System.out.println("char c : " + c);
        System.out.println("byte 범위 : " + b1 + "~" + b2);
        System.out.println("short 범위 : " + s1 + "~" + s2);
        System.out.println("int 범위 : " + i1 + "~" + i2);
        System.out.println("Long 범위: " + l1 + "~" + l2);
        System.out.println("float is : " + f);
        System.out.println("double is : " + d);
    }
}
