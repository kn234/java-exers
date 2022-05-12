import java.util.Scanner;

public class Lopata {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int price = sc.nextInt();
        int r = sc.nextInt();
        int res = 1;

        while ((res * price % 10 != 0) && (res * price % 10 != r)) {
            res += 1;
        }
        System.out.println(res);
    }
}
