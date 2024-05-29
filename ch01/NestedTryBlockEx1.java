package ch01.nestdex;

public class NestedTryBlockEx1 {
    public static void main(String args[]){
        //outer try block
        try{
            //내부 try 블록 1
            try{
                System.out.println("0으로 나누기");
                int b =39/0;
            }catch(ArithmeticException e){
                System.out.println(e);
            }
            // 내부 try 블록 2
            try{
                int a[]=new int[5];
                //assigning the value out of array bounds
                a[5]=4;
            } catch(ArrayIndexOutOfBoundsException e){
                System.out.println(e);
            }
            System.out.println("other statement");
        }catch(Exception e){
            System.out.println("handled the exception (outer catch)");
        }
        System.out.println("normal flow..");
    }
}
