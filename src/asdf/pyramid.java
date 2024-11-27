package asdf;

import java.util.Scanner;

public class pyramid {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String stone = "*";

        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(stone);
            }
            System.out.println();
        }
    }
}
