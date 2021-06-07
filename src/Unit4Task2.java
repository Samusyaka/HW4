import java.util.Random;
import java.util.Scanner;

public class Unit4Task2 {
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
        for (int i = 0; i < n; i++) {
            int j = i;
            if (mass[i][j] % 2 == 1) {
                System.out.print(mass[i][j]+" ");
            }
        }
    }
}
