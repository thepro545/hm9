package ru.skypro;

public class Book {

    private final String bookName;
    private int publishingYear;
    private final Author fullName;

    public Book(String bookName, Author fullName, int publishingYear) {
        this.bookName = bookName;
        this.fullName = fullName;
        this.publishingYear = publishingYear;
    }

    public String getBookName() {
        return bookName;
    }

    public Author getAuthorName() {
        return fullName;
    }

    public int getPublishingYear() {
        return publishingYear;
    }

    public void setPublishingYear(int publishingYear) {
        if (publishingYear < 1950 || publishingYear > 2050) {
            System.out.println("Invalid publishing year parameter: " + publishingYear);
            return;
        }
        this.publishingYear = publishingYear;
    }

}
