import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Реализуйте метод, который запрашивает у пользователя ввод дробного числа
 * (типа float), и возвращает введенное значение. Ввод текста вместо числа не
 * должно приводить к падению приложения, вместо этого, необходимо повторно
 * запросить у пользователя ввод данных.
 */
public class task1 {

    public static void main(String[] args) {
        printUserInputFloatValue();
    }

    private static void printUserInputFloatValue() {
        for (Scanner sc = new Scanner(System.in); true; sc = new Scanner(System.in)) {
            try {
                System.out.println("Введите дробное число...");
                float input = sc.nextFloat();
                System.out.print("Вы ввели число: ");
                System.out.print(input);
                sc.close();
                break;
            } catch (InputMismatchException e) {
                System.out.println("Неправильный формат ввода числа. Попробуйте еще раз.");
            } catch (Exception e) {
                System.out.println("Что-то пошло не так. Попробуйте еще раз.");
            }
        }
    }
}
