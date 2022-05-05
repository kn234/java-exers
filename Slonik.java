import java.util.Scanner;

public class Slonik {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int res = 0;
        while (x!=0){
            if(x/5!=0){
                res+=x/5;
                x=x%5;
            }
            if(x/4!=0){
                res+=x/4;
                x=x%4;
            }
            if(x/3!=3){
                res+=x/3;
                x=x%3;
            }
            if(x/2!=0){
                res+=x/2;
                x=x%2;
            }
            if(x/1!=0){
                res+=x/1;
                x=x%1;
            }
        }
        System.out.println(res);
    }
}
