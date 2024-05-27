package ch01;

public class LowerClass {
    int x;
    int y;

    public LowerClass(){
        x = 20;
        y = 20;
    }
    public LowerClass(int x){
        this();
        this.x = x;
    }
    public LowerClass(int x,int y){
        this(x);
        this.y = y;
    }
}