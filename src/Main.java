// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        // создаем строку
        String name = "Java";

        // Конкатерация строк
        String greeting = "Hello!";
        String message = greeting + "Welcome to " + name + ".";

        // Выводим исходную и новую строки
        System.out.println("Origin string: " + greeting);
        System.out.println("Concatenated string: " + message);

        // Демонстрация изменяемости строк
        System.out.println("Origin string: " + greeting);
        greeting = greeting.toUpperCase();
        System.out.println("Concatenated string still name: " + greeting);

        String s1 = "Hello"; //  создание строки литералом
        String s2 = new String("World!"); // создание строки с помощью конструктора
        String combined = s1 + " " + s2;
        //
        int length = s1.length(); // возвращает длину строки
        //
        boolean isEqual = s1.equals(s2); // сравниваем два строковых объекта (не ссылки на них)
        boolean isEqualIgnoreCase = s1.equalsIgnoreCase(s2); // тоже, но без учета регистра
        // поиск в строке
        int index = s1.indexOf("H"); //
        String s = "Hello, World!";
        String sub = s1.substring(7, 12); // возвращает подстроку World

        String replaced = s.replace("World", "Java");
        // Изменение регистра
        String lower = s.toLowerCase();
        String upper = s.toUpperCase();
        //
        String trimmed = s.trim(); // удаляет начальные и конечные пробелы
        //
        int version = 9;
        String formatted = String.format("Language: %s, Version: %d", name, version);
        //
        String str = "";
        boolean isEmpty = str.isEmpty(); // проверка, является ли строка пустой




    }
}
