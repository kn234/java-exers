
import java.util.Scanner;

public class PetyaAndStrings  {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String first = sc.nextLine();
        String second = sc.nextLine();
        String firstUpdated = first.toLowerCase(), secondUpdated = second.toLowerCase();
        int value = 0;
        for (int i = 0; i < firstUpdated.length(); i++)
            if (firstUpdated.charAt(i) == secondUpdated.charAt(i))
                continue;
            else if (firstUpdated.charAt(i) < secondUpdated.charAt(i)) {
                value = -1;
                break;
            } else {
                value = 1;
                break;
            }
        System.out.println(value);

    }

}