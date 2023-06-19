import java.util.Scanner;

/**
 * Разработайте программу, которая выбросит Exception, когда пользователь вводит
 * пустую строку. Пользователю должно показаться сообщение, что пустые строки
 * вводить нельзя.
 */
public class task4 {

    public static void main(String[] args) throws Exception {
        Scanner sc = null;
        try {
            sc = new Scanner(System.in, System.console().charset());
            System.out.println("Введите любую строку...");
            String input = sc.nextLine();
            if (input.length() == 0)
                throw new Exception("Ошибка. Пустые строки вводить нельзя.");
            System.out.printf("Вы ввели строку: %s", input);
        } finally {
            if (sc != null)
                sc.close();
        }
    }
}