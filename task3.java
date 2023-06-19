/**
 * Дан следующий код, исправьте его там, где требуется.
 */
    public static void main(String[] args) throws Exception {
        try {
            int a = 90;
            int b = 3;
            System.out.println(a / b);
            printSum(23, 234);
            int[] abc = { 1, 2 };
            abc[3] = 9;
        } catch (Throwable ex) {
            System.out.println("Что-то пошло не так...");
        } catch (NullPointerException ex) {
            System.out.println("Указатель не может указывать на null!");
        } catch (IndexOutOfBoundsException ex) {
            System.out.println("Массив выходит за пределы своего размера!");
        }
    }

    public static void printSum(Integer a, Integer b) throws FileNotFoundException {
        System.out.println(a + b);
    }

/**
 * В результате исправления:
 *  - Исправлено выражение abc[3] = 9; т.к. в данном случае будет выход за пределы массива.
 *  - Обработка исключения типа Throwable перенесена в конец списка catch.
 *  - В операторе throws метода printSum изменен тип исключения:
 *    с FileNotFoundException (не может возникнуть в данном контексте)
 *    на NullPointerException (может возникнуть, если один из параметров a,b будет null).
 *  - Убран оператор throws в методе main, т.к. все возможные исключения обрабатываются.
 */
    public static void main(String[] args) {
        try {
            int a = 90;
            int b = 3;
            System.out.println(a / b);
            printSum(23, 234);
            int[] abc = { 1, 2 };
            abc[1] = 9;
        } catch (NullPointerException ex) {
            System.out.println("Указатель не может указывать на null!");
        } catch (IndexOutOfBoundsException ex) {
            System.out.println("Массив выходит за пределы своего размера!");
        } catch (Throwable ex) {
            System.out.println("Что-то пошло не так...");
        }
    }

    public static void printSum(Integer a, Integer b) throws NullPointerException {
        System.out.println(a + b);
    }
