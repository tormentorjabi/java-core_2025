package lr7;
import java.io.*;
import java.util.Scanner;

public class Example9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите путь к исходному файлу: ");
        String sourcePath = scanner.nextLine();

        System.out.print("Введите путь к целевому файлу: ");
        String targetPath = scanner.nextLine();

        try (BufferedReader reader = new BufferedReader(new FileReader(sourcePath));
             BufferedWriter writer = new BufferedWriter(new FileWriter(targetPath))) {

            String line;
            while ((line = reader.readLine()) != null) {
                writer.write(line);
                writer.newLine(); // Добавляем перенос строки
            }

            System.out.println("Файл успешно скопирован!");

        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден: " + e.getMessage());
        } catch (IOException e) {
            System.out.println("Ошибка при копировании: " + e.getMessage());
        }
    }
}