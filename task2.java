/**
 * Если необходимо, исправьте данный код.
 */
        try {
            int d = 0;
            double catchedRes1 = intArray[8] / d;
            System.out.println("catchedRes1 = " + catchedRes1);
        } catch (ArithmeticException e) {
            System.out.println("Catching exception: " + e);
        }

/**
 * В результате исправления:
 *  - исправлено выражение int d = 0; т.к. в данном случае будет ошибка деления на 0.
 *  - добавлена обработка исключения NullPointerException, т.к. intArray может иметь значение null.
 *  - добавлена обработка исключения IndexOutOfBoundsException, т.к. размер массива intArray неопределен.
 */
        try {
            int d = 2;
            double catchedRes1 = intArray[8] / d;
            System.out.println("catchedRes1 = " + catchedRes1);
        } catch (ArithmeticException e) {
            System.out.println("Catching exception: " + e);
        } catch (NullPointerException e) {
            System.out.println("Catching exception: " + e);
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Catching exception: " + e);
        }
