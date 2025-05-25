package lr7;

import java.io.*;
import java.util.Scanner;

public class Example4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите путь к файлу (по умолчанию: src/lr7/example.txt):");
        String filePath = scanner.nextLine();
        String fileName = filePath.isEmpty() ? "src/lr7/example.txt" : filePath;


        File file = new File(fileName);
        File parentDir = file.getParentFile();
        if (parentDir != null && !parentDir.exists()) {
            if (parentDir.mkdirs()) {
                System.out.println("Созданы директории: " + parentDir.getAbsolutePath());
            }
        }

        System.out.println("Введите текст для записи в файл (для завершения введите 'end' на новой строке):");
        StringBuilder content = new StringBuilder();
        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            if (line.equalsIgnoreCase("end")) {
                break;
            }
            content.append(line).append(System.lineSeparator());
        }


        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {
            writer.write(content.toString());
            System.out.println("Данные успешно записаны в файл: " + file.getAbsolutePath());
        } catch (IOException e) {
            System.out.println("Ошибка при записи в файл: " + e.getMessage());
            scanner.close();
            return;
        }


        System.out.println("\nСодержимое файла:");
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("Ошибка при чтении файла: " + e.getMessage());
        }


        System.out.println("\nДополнительные операции:");
        System.out.println("1. Добавить текст в файл");
        System.out.println("2. Перезаписать файл");
        System.out.println("3. Выход");
        System.out.print("Выберите действие: ");

        String choice = scanner.next();
        switch (choice) {
            case "1":
                appendToFile(scanner, fileName);
                break;
            case "2":
                rewriteFile(scanner, fileName);
                break;
            default:
                System.out.println("Работа завершена");
        }

        scanner.close();
    }

    private static void appendToFile(Scanner scanner, String fileName) {
        System.out.println("Введите текст для добавления (для завершения введите 'end'):");
        scanner.nextLine(); // Очистка буфера
        StringBuilder content = new StringBuilder();
        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            if (line.equalsIgnoreCase("end")) {
                break;
            }
            content.append(line).append(System.lineSeparator());
        }

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName, true))) {
            writer.write(content.toString());
            System.out.println("Текст успешно добавлен в файл");
        } catch (IOException e) {
            System.out.println("Ошибка при добавлении текста: " + e.getMessage());
        }
    }

    private static void rewriteFile(Scanner scanner, String fileName) {
        System.out.println("Введите новый текст для файла (для завершения введите 'end'):");
        scanner.nextLine();
        StringBuilder content = new StringBuilder();
        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            if (line.equalsIgnoreCase("end")) {
                break;
            }
            content.append(line).append(System.lineSeparator());
        }

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {
            writer.write(content.toString());
            System.out.println("Файл успешно перезаписан");
        } catch (IOException e) {
            System.out.println("Ошибка при перезаписи файла: " + e.getMessage());
        }
    }
}