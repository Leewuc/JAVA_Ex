package ch01;

public class ByteOverflow {
    public static void main(String args[]){
        byte b = 0;
        int i = 0;

        for(int j =0; j<=270;j++){
            System.out.println(b++);
            System.out.println('\t');
            System.out.println(i++);
        }
    }
}
