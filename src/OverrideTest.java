import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class OverrideTest {

    public static class Test {

        public void method(Integer integer) {
            System.out.println("From Integer" + integer);
        }

        public void method(String string) {
            System.out.println("From String" + string);
        }

    }

    public static void main(String[] a) {

        Test t = new Test();
        t.method(1);
        t.method("naman");
        t.method((String)null);
        t.method((Integer) null);

        int[] array = {1,2,3,4,5,6};
        IntStream.of(array).map(i -> i*5).forEach(System.out::println);

        String s ="naman mehta";
        Stream<Character> data = s.chars().mapToObj(c -> (char)c);
        //data.distinct().forEach(System.out::println);
        System.out.println(data.filter(c -> c=='n').count());


        List<String> words = Arrays.asList("GFG", "Geeks", "for",
                "GeeksQuiz", "GeeksforGeeks");

        Optional<String> longestString = words.stream()
                .reduce((word1, word2)
                        -> word1.length() > word2.length()
                        ? word1 : word2);

        longestString.ifPresent(System.out::println);


    }
}
