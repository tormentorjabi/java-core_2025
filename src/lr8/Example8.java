package lr8;

import java.io.File;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.ArrayList;
import java.util.List;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.w3c.dom.*;

public class Example8 {
    private static final String FILE_PATH = "src/lr8/book.xml";

    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);
            DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
            Document doc = dBuilder.parse(new File(FILE_PATH));
            doc.getDocumentElement().normalize();

            while (true) {
                System.out.println("\n1. Показать все книги");
                System.out.println("2. Добавить новую книгу");
                System.out.println("3. Найти книги по автору");
                System.out.println("4. Найти книги по году");
                System.out.println("5. Удалить книгу по названию");
                System.out.println("6. Выход");
                System.out.print("Выберите действие: ");
                int choice = Integer.parseInt(scanner.nextLine());

                switch (choice) {
                    case 1 -> showBooks(doc);
                    case 2 -> {
                        System.out.print("Введите название книги: ");
                        String title = scanner.nextLine();
                        System.out.print("Введите автора: ");
                        String author = scanner.nextLine();
                        System.out.print("Введите год издания: ");
                        String year = scanner.nextLine();
                        addBook(doc, title, author, year);
                        saveDocument(doc);
                    }
                    case 3 -> {
                        System.out.print("Введите имя автора: ");
                        String author = scanner.nextLine();
                        findBooksByAuthor(doc, author);
                    }
                    case 4 -> {
                        System.out.print("Введите год издания: ");
                        String year = scanner.nextLine();
                        findBooksByYear(doc, year);
                    }
                    case 5 -> {
                        System.out.print("Введите название книги для удаления: ");
                        String title = scanner.nextLine();
                        deleteBookByTitle(doc, title);
                        saveDocument(doc);
                    }
                    case 6 -> {
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

    private static void showBooks(Document doc) {
        NodeList nodeList = doc.getElementsByTagName("entry");
        for (int i = 0; i < nodeList.getLength(); i++) {
            Element element = (Element) nodeList.item(i);
            System.out.println("\nНазвание книги: " + element.getElementsByTagName("title").item(0).getTextContent());
            System.out.println("Автор: " + element.getElementsByTagName("author").item(0).getTextContent());
            System.out.println("Год издания: " + element.getElementsByTagName("year").item(0).getTextContent());
        }
    }

    private static void addBook(Document doc, String title, String author, String year) {
        Element root = doc.getDocumentElement();
        Element book = doc.createElement("entry");

        Element titleElement = doc.createElement("title");
        titleElement.appendChild(doc.createTextNode(title));

        Element authorElement = doc.createElement("author");
        authorElement.appendChild(doc.createTextNode(author));

        Element yearElement = doc.createElement("year");
        yearElement.appendChild(doc.createTextNode(year));

        book.appendChild(titleElement);
        book.appendChild(authorElement);
        book.appendChild(yearElement);

        root.appendChild(book);
        System.out.println("Книга добавлена.");
    }

    private static void findBooksByAuthor(Document doc, String author) {
        List<Element> books = getBooks(doc);
        List<Element> result = books.stream()
                .filter(el -> el.getElementsByTagName("author").item(0).getTextContent().equalsIgnoreCase(author))
                .collect(Collectors.toList());

        if (result.isEmpty()) {
            System.out.println("Книги не найдены.");
        } else {
            result.forEach(Example8::printBook);
        }
    }

    private static void findBooksByYear(Document doc, String year) {
        List<Element> books = getBooks(doc);
        List<Element> result = books.stream()
                .filter(el -> el.getElementsByTagName("year").item(0).getTextContent().equals(year))
                .collect(Collectors.toList());

        if (result.isEmpty()) {
            System.out.println("Книги не найдены.");
        } else {
            result.forEach(Example8::printBook);
        }
    }

    private static void deleteBookByTitle(Document doc, String title) {
        NodeList nodeList = doc.getElementsByTagName("entry");
        boolean deleted = false;

        for (int i = 0; i < nodeList.getLength(); i++) {
            Element book = (Element) nodeList.item(i);
            String currentTitle = book.getElementsByTagName("title").item(0).getTextContent();
            if (currentTitle.equalsIgnoreCase(title)) {
                book.getParentNode().removeChild(book);
                System.out.println("Книга удалена.");
                deleted = true;
                break;
            }
        }

        if (!deleted) {
            System.out.println("Книга не найдена.");
        }
    }

    private static void saveDocument(Document doc) {
        try {
            Transformer transformer = TransformerFactory.newInstance().newTransformer();
            DOMSource source = new DOMSource(doc);
            StreamResult result = new StreamResult(new File(FILE_PATH));
            transformer.transform(source, result);
        } catch (Exception e) {
            System.out.println("Ошибка при сохранении XML: " + e.getMessage());
        }
    }

    private static List<Element> getBooks(Document doc) {
        NodeList nodeList = doc.getElementsByTagName("entry");
        List<Element> books = new ArrayList<>();
        for (int i = 0; i < nodeList.getLength(); i++) {
            books.add((Element) nodeList.item(i));
        }
        return books;
    }

    private static void printBook(Element el) {
        System.out.println("\nНазвание: " + el.getElementsByTagName("title").item(0).getTextContent());
        System.out.println("Автор: " + el.getElementsByTagName("author").item(0).getTextContent());
        System.out.println("Год: " + el.getElementsByTagName("year").item(0).getTextContent());
    }
}
