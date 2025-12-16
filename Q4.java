import java.util.*;

public class Q4 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your sentence:");
        String s = input.nextLine();
        int x = 0;
        x = s.trim().split(" +").length;




        int vowels = 0;
        int otherLetters = 0;
        int spaces = 0;
        int digits = 0;

        s = s.toLowerCase();

        for (int i = 0; i < s.length(); i++) {
            if (Character.isDigit(s.charAt(i))) {
                digits++;
            }
        }

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                vowels++;
            }
            else if (ch == ' ') {
                spaces++;
            }
            else if (Character.isLetter(ch)) {
                otherLetters++;
            }
        }

        int words = spaces + 1;

        System.out.println("Number of vowels = " + vowels);
        System.out.println("Number of other letters = " + otherLetters);
        System.out.println("Number of spaces = " + spaces);
        System.out.println("Number of digits = " + digits);
        System.out.println("Number of words = " + x);
    }
}
