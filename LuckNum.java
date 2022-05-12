import java.util.Scanner;

public class LuckNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String line=sc.nextLine();
        if(line.length()==4||line.length()==7){
            int num=Integer.parseInt(line);
            while(num!=0){
                if(num%10!=4&&num%10!=7){
                    System.out.println("NO");
                    break;
                }else{
                    num/=10;

                }

            }
            if (num/10==0){
                System.out.println("YES");
            }

        }else{
            System.out.println("NO");
        }



    }
}
