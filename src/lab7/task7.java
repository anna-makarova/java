package lab7;


import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class task7 {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите название файла в папке example: ");
        String data = scanner.nextLine();
        FileWriter writer = new FileWriter("C:\\example_folder/" + data);
        System.out.print("Введите что записать: ");
        String text = scanner.nextLine();
        writer.write(text);
        writer.close();
        System.out.println("Файл записан успешно");
    }
}