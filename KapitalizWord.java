import java.util.Scanner;

public class KapitalizWord {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word = sc.next();
        String ch = word.charAt(0)+"";

        System.out.println(ch.toUpperCase()+word.substring(1,word.length()));
    }
}
