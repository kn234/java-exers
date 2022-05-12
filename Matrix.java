import java.util.Scanner;

import static java.lang.Math.abs;

public class Matrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = 1;
        int j = 1;
        while (sc.nextInt() != 1) {
            i += 1;
            if (i == 6) {
                i = 1;
                j += 1;
            }
        }
        System.out.println(abs(3 - i) + abs(3 - j));

    }

}

