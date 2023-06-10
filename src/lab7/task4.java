package lab7;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class task4 {
    public static void main(String[] args) throws IOException {
        FileReader reader = new FileReader("C:\\example_folder/example_file.txt");
        FileWriter writer = new FileWriter("C:\\example_folder/example_copy.txt");

        int s;

        while ((s = reader.read()) != -1) {
            writer.write(s);
        }
        reader.close();
        writer.close();
        System.out.println("Файл скопирован успешно!");
    }
}
