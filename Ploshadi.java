import java.util.Scanner;

public class Ploshadi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        long nd = 0;
        long md = 0;
        int a = sc.nextInt();
        if (n%a!=0){
            nd=n/a+1;
        }else{
            nd=n/a;
        }
        if(m%a!=0){
            md=m/a+1;
        }else{
            md=m/a;
        }
        System.out.println(nd*md);
    }
}
