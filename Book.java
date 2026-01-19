package org.example;

public class Book {
    private String title;
    private int releaseYear;
    private Author author;
    private int pages;

    public Book(String title, int releaseYear, Author author, int pages) {
        this.title = title;
        this.releaseYear = releaseYear;
        this.author = author;
        this.pages = pages;
    }

    public boolean isBig() {
        return pages > 500;
    }

    public boolean matches(String word) {
        return title.contains(word) ||
                author.getName().contains(word) ||
                author.getSurname().contains(word);
    }

    public int estimatePrice() {
        double basePrice = 3 * pages * Math.sqrt(author.getRating());
        int price = (int) Math.floor(basePrice);
        return Math.max(price, 250);
    }

    public String getTitle() {
        return title;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    public Author getAuthor() {
        return author;
    }

    public int getPages() {
        return pages;
    }
}