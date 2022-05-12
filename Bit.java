import java.util.Scanner;

public class Bit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int res = 0;

        for(int i=0;i<n+1;i++){

            String line = sc.nextLine();
            if(line.equals("X++") || line.equals("++X")){
                res+=1;
            }else if(line.equals("X--") || line.equals("--X")){
                res-=1;
            }
        }
        System.out.println(res);
    }
}
