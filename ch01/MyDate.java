package ch01;

public class MyDate {
    private int year;
    private int month;
    private int day;

    public MyDate(int y, int m, int d){
        year = y;
        month = m;
        day = d;
        String s = "홍길동";
        String s2 = new String("홍길동");

    }

    // Accessor method (Getter method)
    public int getYear() {
        return year;
    }

    // Mutator method (Setter method)
    public void setYear(int year) {
        this.year = year;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public void print(){
        System.out.println("MyDate: " + year + "-" + month + "-" + day);
    }
}
