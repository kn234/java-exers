import java.util.Scanner;

public class Translate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String n = sc.nextLine();
        String k = sc.nextLine();
        String m = "";
        for (int i = n.length()-1; i >= 0 ; i--) {
            m+=n.charAt(i);
        }
        if(k.equals(m)){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }

    }
}
