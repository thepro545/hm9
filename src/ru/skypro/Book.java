package ru.skypro;

public class Book {

    private String authorName;
    private String bookName;
    private int publishingYear;

    public Book(String bookName, String authorName, int publishingYear){
        this.bookName = bookName;
        this.authorName = authorName;
        this.publishingYear = publishingYear;
    }

    public String getbookName() {
        return bookName;
    }
    public String getAuthorName() {
        return authorName;
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
