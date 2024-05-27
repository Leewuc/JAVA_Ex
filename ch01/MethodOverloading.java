package ch01;

public class MethodOverloading {
    public static void main(String[] args){

        CalcAdder adder = new CalcAdder();
        // 메서드 오버로딩 조건 성립 - 매개변수 개수가 다르다
        adder.add(10,20);
        adder.add(10,20,30);
        // 메서드 오버로딩 조건 성립 - 매개변수 데이터 타입이 다르다
        adder.add(12.5D,21.7D);
    }
}

class CalcAdder{
    int add(int a,int b){
        return a + b;
    }
    int add(int a,int b,int c){
        return a + b + c;
    }
    double add(double a,double b){
        return a + b;
    }
}
