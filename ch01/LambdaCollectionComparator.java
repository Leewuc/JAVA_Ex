package ch01;
import java.util.Collection;
import java.util.list;
public class LambdaCollectionComparator {
    public static void main(String[] args) {
        List<LambdaProduct> list = new ArrayList<>();
        list.add(new LambdaProduct(1,"노트북",25000));
        list.add(new LambdaProduct(3,"키보드",300));
        list.add(new LambdaProduct(2,"마우스",150));

        System.out.println("이름 기준 정렬");

        Collections.sort(list,(p1,p2)->{
            return p1.name.compareTo(p2.name);
        });

        for(LambdaProduct p:list){
            System.out.println(
                    p.id+" "+p.name+" "+p.price);
        }
    }
}
