package lr2;

import java.util.Objects;
import java.util.Scanner;

public class Example3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите текст для шифрования: ");
        String text = in.nextLine();

        System.out.print("Введите ключ: ");
        int key = in.nextInt();

        char[] arrayChar = text.toCharArray();

        long[] arrayInt = new long[arrayChar.length];
        char[] arrayCharNew = new char[arrayChar.length];

        for (int i = 0; i < arrayChar.length; i++) {

            arrayInt[i] = arrayChar[i] + key;
            arrayCharNew[i] = (char) arrayInt[i];
        }
        text = new String(arrayCharNew);
        arrayChar = text.toCharArray();
        System.out.printf("Текст после преобразования: %s \n", text);

        while (true){
            System.out.print("Выполнить обратное преобразование? (y/n)");
            String choice = in.next();
            if(Objects.equals(choice, "y")){
                for (int i = 0; i < arrayChar.length; i++) {

                    arrayInt[i] = arrayChar[i] - key;
                    arrayCharNew[i] = (char) arrayInt[i];
                }
                text = new String(arrayCharNew);
                System.out.printf("Текст до преобразования: %s \n", text);
                break;

            } else if (Objects.equals(choice, "n")) {
                System.out.println("До свидания!");
                break;
            }

            else System.out.println("Введите корректный ответ!");
        }
    }
}
