import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        long startTime = 0;
        long endTime = 0;
        long durationTime = 0;
        List<String> stringList = Arrays.asList("홍길동", "로보캅", "김자바", "고길동", "자바액션!", "9999", "7777");

        System.out.println("------------------------------normal for");
        //일반적인 for
        for (int i = 0; i < stringList.size(); i++) {
            System.out.println(stringList.get(i));
        }
        System.out.println("----------------------------------------");

        System.out.println("-----------------------------enhanced for");
        //향상된 for
        for (String a : stringList) {
            System.out.println(a);
        }
        System.out.println("----------------------------------------");

        System.out.println("-----------------------------iterator");
        //Iterator
        Iterator<String> stringIterator = stringList.iterator();
        while (stringIterator.hasNext()) {
            System.out.println(stringIterator.next());
        }
        System.out.println("----------------------------------------");

        /**
         * forEachRemaining() 를 호출하는 것 이외의 방법으로 반복 처리가 진행되고있는 동안에 기본 컬렉션이 수정되면 반복기의 동작은 지정되지 않습니다.
         * "지정되지 않은 동작" 부분도 이 내부 반복 중에 적용.
         * stringIterator 로 변경해서 호출하면, 아무작업도 하지 않는다.
         */
        System.out.println("-----------------------------iterator2");
        Iterator<String> stringIterator2 = stringList.iterator();
        stringIterator2.forEachRemaining((s) -> {
            System.out.println(s);
        });
        System.out.println("----------------------------------------");

        System.out.println("---------------Stream-------------------");
        //Stream
        stringList.stream().forEach((str) -> {
            System.out.println(str);
        });

    }
}
