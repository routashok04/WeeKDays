import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Cube {
    public static void main(String[] args) {
        List<Integer> list= Arrays.asList(1,2,3,4,5,6,7,8);
        list.stream().map(n->n*n).forEach(System.out::println);
        Optional<Integer> optional = list.stream().reduce((a, b) -> a * b);
        if(optional.isPresent()){
            System.out.println("Multiplication using reduce method:" +optional.get());
        }
        else{
            System.out.println("Empty array");
        }
    }
}
