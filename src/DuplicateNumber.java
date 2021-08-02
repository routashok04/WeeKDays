import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class DuplicateNumber {
    public static void main(String[] args) {
        List<Integer> integers = Arrays.asList(1, 3, 5, 8, 5, 13, 15, 13, 25, 15, 25);
        Set<Integer>set=new HashSet<>();
        integers.stream().filter(x-> !set.add(x)).collect(Collectors.toSet()).forEach(System.out::println);

    }
}
