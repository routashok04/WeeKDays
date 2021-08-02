import java.util.Scanner;

public class CountWord {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a String:");
        String s = scanner.nextLine();
        int count=countNumberofWords(s);
        System.out.println("No of Words in Strings :" +count);
    }

    private static Integer countNumberofWords(String s) {
        int count=0;
        if (s.charAt(0)!=' '){
            count++;
        }
        for (int i = 0; i <s.length() ; i++) {
            if (s.charAt(i)==' ' && s.charAt(i+1)!=' '){
                count++;
            }

        }
        return count;
    }
}
