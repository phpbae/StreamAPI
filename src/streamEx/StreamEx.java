package streamEx;


import java.util.Arrays;
import java.util.List;

public class StreamEx {

    public static void callStream() {
        List<String> myList = Arrays.asList("a1", "a2", "b1", "c2", "c1");

        myList.stream()
                .filter(s -> s.startsWith("c"))
                .map(String::toUpperCase)
                .sorted()
                .forEach(System.out::println);

        //스트림 연산 파이프라인
        //filter / map / sorted  는 중간연산
        //forEach 는 단말연산

        String resultStr = myList.stream()
                .map(s -> s.toUpperCase())
                .filter(s -> s.equals("A1"))
                .findAny()
                .get();
        String resultStr2 = myList.stream()
                .map(s -> s.toUpperCase())
                .filter(s -> s.equals("A2"))
                .findFirst()
                .get();
        boolean result = myList
                .stream()
                .map(s -> s.toUpperCase())
                .anyMatch(s -> s.equals("B1"));
        boolean result2 = myList.stream()
                .filter(s -> s.equals("a1"))
                .findAny()
                .isPresent();

        System.out.println(resultStr);
        System.out.println(resultStr2);
        System.out.println(result);
        System.out.println(result2);
    }


}
