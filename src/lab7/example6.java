package lab7;

import java.io.*;

public class example6 {
    public static void main(String[] args) {
        String inputFileName = "C:\\example_folder/example_file.txt";
        String outputFileName = "C:\\example_folder/example_copy.txt";
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(inputFileName));
             PrintWriter printWriter = new PrintWriter(outputFileName, "UTF-8")) {
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                printWriter.write(line.toUpperCase());
            }
            System.out.println("Данные записаны в файл: " + outputFileName);

        } catch (IOException e) {
            System.out.println("Ошибка при чтении/записи файла: " + e.getMessage());
        }
    }
}
