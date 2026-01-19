package org.example;

public class Main {
    public static void main(String[] args) {
        Author author1 = new Author("Лев", "Толстой", 95);
        Author author2 = new Author("Антуан", "де Сент-Экзюпери", 88);
        Author author3 = new Author("Джордж", "Оруэлл", 92);

        Book book1 = new Book("Война и мир", 1867, author1, 1225);
        Book book2 = new Book("Маленький принц", 1943, author2, 96);
        Book book3 = new Book("1984", 1949, author3, 328);
        Book book4 = new Book("Анна Каренина", 1877, author1, 864);

        System.out.println("=== Демонстрация работы класса Book ===");
        System.out.println();

        System.out.println("Книга 1: " + book1.getTitle());
        System.out.println("Большая ли книга? " + book1.isBig());
        System.out.println("Содержит слово 'война'? " + book1.matches("война"));
        System.out.println("Содержит слово 'Толстой'? " + book1.matches("Толстой"));
        System.out.println("Содержит слово 'мир'? " + book1.matches("мир"));
        System.out.println("Оценка стоимости: " + book1.estimatePrice() + " руб.");
        System.out.println();

        System.out.println("Книга 2: " + book2.getTitle());
        System.out.println("Большая ли книга? " + book2.isBig());
        System.out.println("Содержит слово 'принц'? " + book2.matches("принц"));
        System.out.println("Содержит слово 'Антуан'? " + book2.matches("Антуан"));
        System.out.println("Содержит слово 'Сент'? " + book2.matches("Сент"));
        System.out.println("Оценка стоимости: " + book2.estimatePrice() + " руб.");
        System.out.println();

        System.out.println("Книга 3: " + book3.getTitle());
        System.out.println("Большая ли книга? " + book3.isBig());
        System.out.println("Содержит слово '1984'? " + book3.matches("1984"));
        System.out.println("Содержит слово 'Джордж'? " + book3.matches("Джордж"));
        System.out.println("Оценка стоимости: " + book3.estimatePrice() + " руб.");
        System.out.println();

        System.out.println("Книга 4: " + book4.getTitle());
        System.out.println("Большая ли книга? " + book4.isBig());
        System.out.println("Содержит слово 'Анна'? " + book4.matches("Анна"));
        System.out.println("Содержит слово 'Каренина'? " + book4.matches("Каренина"));
        System.out.println("Оценка стоимости: " + book4.estimatePrice() + " руб.");
        System.out.println();

        System.out.println("=== Дополнительные проверки ===");
        System.out.println("Книга 2 содержит слово 'большой'? " + book2.matches("большой"));
        System.out.println("Книга 1 и книга 4 одного автора? " +
                (book1.getAuthor().getName().equals(book4.getAuthor().getName()) &&
                        book1.getAuthor().getSurname().equals(book4.getAuthor().getSurname())));
    }
}