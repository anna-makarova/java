package lab7;

import java.io.File;
import java.util.Scanner;

public class task5 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите название файла в папке example: ");
        String data = scanner.nextLine();

        File file = new File("C:\\example_folder/" + data);

        long size = file.length();
        System.out.println("Размер файла " + size + " байт");
    }
}
