public class Task2 {
    public static void main(String[] args) {
        // Создаем объект StringBuilder с начальным содержимым
        StringBuilder builder = new StringBuilder("Hello");

        // Добавляем дополнительный текст
        builder.append(", World");
        builder.append("!");

        // Выводим текущее состояние StringBuilder
        System.out.println("Current StringBuilder content: " + builder.toString());


        // Добавляем текст в начало
        builder.insert(0, "Greetings: ");

        // Выводим измененное состояние
        System.out.println("Modified StringBuilder content: " + builder.toString());

        StringBuilder builder1 = new StringBuilder("Hello, Java World!");
        System.out.println(builder1);
        // Удаляем часть строки
        builder1.delete(6, 11); // Удаляем слово "Java"
        System.out.println("After deletion: " + builder1.toString());

        // Заменяем часть строки
        builder1.replace(7, 12, "Universe");
        System.out.println("After replacement: " + builder1.toString());
        System.out.println("последнее");

        System.out.println(System.identityHashCode(builder)); // для вывода ссылки на метод

        // Постепенно добавляем текст
        StringBuilder builder2 = new StringBuilder();

        builder2.append("Java ");
        builder2.append("is ");
        builder2.append("awesome.");

        // Преобразуем StringBuilder обратно в строку
        String finalString = builder2.toString();

        // Выводим итоговую строку
        System.out.println("Final string: " + finalString);



    }
}
