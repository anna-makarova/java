package lab3;

import java.util.Scanner;

public class example2 {
    public static void main(int x, int X) {
        if((2 * x + 1) < X) {
            main(2 * x + 1, X);
        }
        System.out.println("x=" + x);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Я выведу все значения по формуле x = 2x+1");
        System.out.println("Введите начальное значение: ");
        int firstX = scanner.nextInt();

        System.out.println("Введите конечное значение: ");
        int lastX = scanner.nextInt();

        main(firstX, lastX);
    }
}
