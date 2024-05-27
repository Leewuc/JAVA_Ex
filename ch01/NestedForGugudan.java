package ch01;

public class NestedForGugudan {
    public static void main(String args[]) {

        // 구구단 가로 출력
        for(int i=2; i<=9; i++) {
            for(int j=1; j<10; j++) {
                System.out.print(i + " X " + j + " = " + (i*j) +"\t");
            }
            System.out.println();
        }

        for(int i = 2; i <=9 ; i++)
            System.out.print("[" + i + "단]\t\t");
        System.out.println();

        // 구구단 세로 출력
        for(int i = 1; i <=9 ; i++) {
            for (int j = 2; j<=9 ; j++) {
                //System.out.print(j+" X "+i+" = "+ (i*j) + "\t");
                System.out.printf("%d X %d = %2d\t", j, i, j*i);
            }
            System.out.println();
        }

    }
}
