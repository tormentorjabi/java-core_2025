package lr7;

import java.io.*;
import java.util.Scanner;

public class Example6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите данные для записи в файл:");
        String inputData = scanner.nextLine();
        String outputFileName = "src/lr7/output.txt";

        try (PrintWriter printWriter = new PrintWriter(outputFileName, "UTF-8")) {
            printWriter.println(inputData.toUpperCase());
            System.out.println("Данные записаны в файл: " + outputFileName);
        } catch (IOException e) {
            System.out.println("Ошибка при записи файла: " + e.getMessage());
        }
    }
}