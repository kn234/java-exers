import java.util.Scanner;

public class LongWord {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        int i = 0;
        while (i < n) {
            i++;
            String word = sc.nextLine();
            if (word.length() > 10) {
                System.out.println(word.charAt(0) + "" + (word.length() - 2) + "" + word.charAt(word.length()-1));
            } else {
                System.out.println(word);
            }
        }
    }
}
