package lr8;

import java.io.FileReader;
import java.io.FileWriter;
import java.util.Iterator;
import java.util.Scanner;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class Example9 {
    private static final String FILE_PATH = "src/lr8/book.json";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            JSONParser parser = new JSONParser();
            JSONObject jsonObject = (JSONObject) parser.parse(new FileReader(FILE_PATH));
            JSONArray jsonArray = (JSONArray) jsonObject.get("books");

            while (true) {
                System.out.println("\n1. Показать все книги");
                System.out.println("2. Добавить новую книгу");
                System.out.println("3. Найти книги по автору");
                System.out.println("4. Удалить книгу по названию");
                System.out.println("5. Выход");
                System.out.print("Выберите действие: ");
                String choice = scanner.nextLine();

                switch (choice) {
                    case "1" -> showBooks(jsonArray);
                    case "2" -> {
                        System.out.print("Введите название книги: ");
                        String title = scanner.nextLine();
                        System.out.print("Введите автора: ");
                        String author = scanner.nextLine();
                        System.out.print("Введите год издания: ");
                        int year = Integer.parseInt(scanner.nextLine());
                        addBook(jsonArray, title, author, year);
                        saveJson(jsonObject);
                    }
                    case "3" -> {
                        System.out.print("Введите имя автора: ");
                        String author = scanner.nextLine();
                        findBooksByAuthor(jsonArray, author);
                    }
                    case "4" -> {
                        System.out.print("Введите название книги для удаления: ");
                        String title = scanner.nextLine();
                        deleteBookByTitle(jsonArray, title);
                        saveJson(jsonObject);
                    }
                    case "5" -> {
                        System.out.println("Выход из программы.");
                        return;
                    }
                    default -> System.out.println("Неверный выбор.");
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static void showBooks(JSONArray jsonArray) {
        for (Object o : jsonArray) {
            JSONObject book = (JSONObject) o;
            printBook(book);
        }
    }

    private static void addBook(JSONArray jsonArray, String title, String author, int year) {
        JSONObject newBook = new JSONObject();
        newBook.put("title", title);
        newBook.put("author", author);
        newBook.put("year", year);
        jsonArray.add(newBook);
        System.out.println("Книга добавлена.");
    }

    private static void findBooksByAuthor(JSONArray jsonArray, String author) {
        boolean found = false;
        for (Object o : jsonArray) {
            JSONObject book = (JSONObject) o;
            if (author.equalsIgnoreCase((String) book.get("author"))) {
                printBook(book);
                found = true;
            }
        }
        if (!found) System.out.println("Книги не найдены.");
    }

    private static void deleteBookByTitle(JSONArray jsonArray, String title) {
        Iterator<?> iterator = jsonArray.iterator();
        boolean deleted = false;
        while (iterator.hasNext()) {
            JSONObject book = (JSONObject) iterator.next();
            if (title.equalsIgnoreCase((String) book.get("title"))) {
                iterator.remove();
                deleted = true;
                System.out.println("Книга удалена.");
                break;
            }
        }
        if (!deleted) {
            System.out.println("Книга не найдена.");
        }
    }

    private static void saveJson(JSONObject jsonObject) {
        try (FileWriter file = new FileWriter(FILE_PATH)) {
            file.write(jsonObject.toJSONString());
            file.flush();
        } catch (Exception e) {
            System.out.println("Ошибка при сохранении JSON: " + e.getMessage());
        }
    }

    private static void printBook(JSONObject book) {
        System.out.println("\nТекущий элемент: book");
        System.out.println("Название книги: " + book.get("title"));
        System.out.println("Автор: " + book.get("author"));
        System.out.println("Год издания: " + book.get("year"));
    }
}

