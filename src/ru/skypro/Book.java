package ru.skypro;

public class Book {

    private String bookName;
    private int publishingYear;
    private Author fullName;

    public Book(String bookName, String fullName, int publishingYear){
        this.bookName = bookName;
        Author.fullName = fullName;
        this.publishingYear = publishingYear;
    }

    public String getbookName() {
        return bookName;
    }
    public String getAuthorName() {
        return Author.fullName;
    }
    public int getpublishingYear() {
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
