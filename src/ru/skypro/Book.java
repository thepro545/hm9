package ru.skypro;

public class Book {

    private String authorName;
    private String bookName;
    private int publishingYear;

    public static Book createBook(String bookName, String authorName, int publishingYear){
        Book book = new Book();
        book.bookName = bookName;
        book.authorName = authorName;
        book.publishingYear = publishingYear;
        return book;
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
