import java.util.*;

public class weekday {
    public static void main(String[] args) {
        HashMap<String,Integer>weekdays=new HashMap<>();
        weekdays.put("Monday",0);
        weekdays.put("Tuesday",1);
        weekdays.put("Wednesday",2);
        weekdays.put("Thursday",3);
        weekdays.put("Friday",4);
        weekdays.put("Saturday",5);
        weekdays.put("Sunday",6);

        List<String> list = Arrays.asList("Thursday", "Wednesday", "Friday", "Monday", "Saturday");
     //  list.sort(new Comparator<String>() {
    //       @Override
    //       public int compare(String o1, String o2) {
     //          return weekdays.get(o1).compareT o(weekdays.get(o2));
     //      }
     //  });
      //     Collections.sort(list,(o1,o2)->weekdays.get(o1).compareTo(weekdays.get(o2)));
      //  System.out.println(list);
     list.stream().sorted((o1,o2)->weekdays.get(o1).compareTo(weekdays.get(o2)))
             .forEach(System.out::println);
    }
}
