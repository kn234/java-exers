import java.util.Scanner;

public class YuraAndObzhaga {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        int count = 0;
        for (int i = 0; i < k; i++) {
            int m = sc.nextInt();
            int n = sc.nextInt();
            if(n-m>=2){
                count+=1;
            }
        }
        System.out.println(count);

    }
}
