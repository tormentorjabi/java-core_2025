package lr8;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Example10 {
    public static void main(String[] args) {
        String url = "https://74.ru/";
        int maxAttempts = 3;
        int attempt = 0;
        boolean success = false;

        while (attempt < maxAttempts && !success) {
            try {
                System.out.println("Попытка подключения №" + (attempt + 1));
                Document doc = Jsoup.connect(url).get();

                Elements items = doc.select("a[href*=\"/text/\"]");
                System.out.println("Найдено ссылок на тексты: " + items.size());

                if (items.isEmpty()) {
                    System.out.println("⚠️ Не найдено подходящих ссылок — структура могла измениться");
                }

                File outFile = new File("src/lr8/news.txt");
                outFile.getParentFile().mkdirs();

                try (FileWriter writer = new FileWriter(outFile)) {
                    int count = 0;
                    for (Element el : items) {
                        if (count >= 10) break;
                        String title = el.text().trim();
                        String link = el.absUrl("href").trim();
                        if (title.isEmpty() || link.isEmpty()) continue;

                        System.out.println("Тема: " + title);
                        System.out.println("Ссылка: " + link + "\n");

                        writer.write("Тема: " + title + System.lineSeparator());
                        writer.write("Ссылка: " + link + System.lineSeparator());
                        writer.write(System.lineSeparator());

                        count++;
                    }

                    System.out.println("✅ Сохранено " + (count) + " новостей в " + outFile.getAbsolutePath());
                } catch (IOException e) {
                    System.out.println("❗ Ошибка записи: " + e.getMessage());
                }

                success = true;

            } catch (IOException e) {
                attempt++;
                System.out.println("Ошибка подключения: " + e.getMessage());
                if (attempt < maxAttempts) {
                    System.out.println("Повторная попытка...\n");
                }
            }
        }
    }
}
