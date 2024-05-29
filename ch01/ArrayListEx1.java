package ch01.arraylist;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Vector;

public class ArrayListEx1 {
    public static void main(String[] args){
        //ArrayList arrList = new ArrayList();
        ArrayList<Integer> arrList = new ArrayList<Integer>();
        // add() 메소드를 이용한 요소의 저장
        arrList.add(40);
        arrList.add(20);
        arrList.add(30);
        arrList.add(10);
        System.out.println("1->" + arrList);

        // remove() 메소드를 이용한 요소의 제거
        arrList.remove(1);
        System.out.println("2->" + arrList);

        // Collections.sort() 메소드를 이용한 요소의 정렬
        Collections.sort(arrList);
        // iterator() 메소드와 get()   메소드를 이용한 요소의 출력
        System.out.print("3->");
        Iterator<Integer> iter = arrList.iterator();
        while (iter.hasNext()) {
            System.out.print(iter.next() + " ");
        }
        System.out.println();

        // set() 메소드를 이용한 요소의 변경
        arrList.set(0, 20);
        System.out.println("4->" + arrList);
        // size() 메소드를 이용한 요소의 총 개수
        System.out.println("5-> 리스트의 크기 : " + arrList.size());

        Vector v = new Vector();
    }
}
