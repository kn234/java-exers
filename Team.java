import java.util.Scanner;

public class Team {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        int i = 0;
        int res = 0;
        while (i < n) {
            i++;
            int a=sc.nextInt();
            int b=sc.nextInt();
            int c=sc.nextInt();

            sc.nextLine();
            if (a+b+c>1) {
                res++;
            }
        }
        System.out.println(res);
    }
}
