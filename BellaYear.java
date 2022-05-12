import java.util.Scanner;

public class BellaYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt()+1;
        int flag = 0;
        while (flag == 0) {
            int a1 = k / 10 / 10 / 10;
            int a2 = k / 10 / 10 % 10;
            int a3 = k / 10 % 10;
            int a4 = k % 10;
            if (a1 != a2 && a1 != a3 && a1 != a4 && a2 != a3 && a2 != a4 && a3 != a4) {
                flag=1;
            }else{
                k+=1;
            }
        }
        System.out.println(k);

    }
}
