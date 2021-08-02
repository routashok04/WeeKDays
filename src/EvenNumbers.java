import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class EvenNumbers {
    public static void main(String[] args) {
        List<Integer> integers = Arrays.asList(1, 2, 5, 8, 11, 16);
        List<Integer> collect = integers.stream().filter(i -> i % 2 == 0).collect(Collectors.toList());
        Integer reduce = collect.stream().reduce(0, (x, y) -> x + y);
        System.out.println("Adding even numbers:"+reduce);

    }
}
