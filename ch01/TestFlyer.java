package ch01.flyerinf;

public class TestFlyer {
    public static void main(String args[]){
        Flyer f1 = new Bird();
        Flyer f2 = new Airplane();
        Flyer f3 = new Superman();
        f1.fly();
        f2.fly();
        f3.fly();

        Flyer[] flyers = new Flyer[3];
        flyers[0] = new Bird();
        flyers[1] = new Airplane();
        flyers[2] = new Superman();

        for(int i=0; i < flyers.length; i++){
            flyers[i].land();
        }
    }
}
