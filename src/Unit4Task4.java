import java.util.Random;
import java.util.Scanner;

public class Unit4Task4 {
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
        int summ = 0;
        for (int i = 0; i < mass.length; i++) {
            int j = mass.length - 1 - i;
            if (mass[i][j] % 2 == 0) {
                summ += mass[i][j];
            }
        }
        System.out.println(summ);
    }
}
