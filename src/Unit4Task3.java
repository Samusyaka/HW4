import java.util.Random;
import java.util.Scanner;

public class Unit4Task3 {
    public static void main(String[] args) {
        System.out.println("Введите размерность матрицы");
        Scanner sc = new Scanner(System.in);
        Random r = new Random();
        int n;
        n = sc.nextInt();

        int mass[][] = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                mass[i][j] = r.nextInt(50);
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(mass[i][j] + " ");
            }
            System.out.println();
        }
        int AB1 = 1;
        for (int i = 0; i < mass.length; i++) {
            int j = i;
            AB1 *= mass[i][j];
        }
        System.out.println(AB1);
        int AB2 = 1;
        for (int i = 0; i < mass.length; i++) {
            int j = mass.length - 1 - i;
            AB2 *= mass[i][j];
        }
        System.out.println(AB2);

        if (AB1 > AB2) {
            System.out.println(AB1 + ">" + AB2);
        } else if (AB1 == AB2) {
            System.out.println(AB1 + "=" + AB2);
        } else {
            System.out.println(AB1 + "<" + AB2);
        }
    }
}