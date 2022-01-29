package ru.skypro;

public class Main {


    public static void main(String[] args) {

        Book fahrenheit451 = new Book("Fahrenheit 451", new Author("Ray", "Bradbury"), 1953);
        Book alchemist = new Book("Alchemist", new Author("Paulo","Coelho"), 1988);
        Author RayBradbury = new Author("Ray", "Bradbury");
        Author PauloCoelho = new Author("Paulo","Coelho");
        System.out.println("fahrenheit451 about = bookName - " + fahrenheit451.getbookName() + ", authorName - " + fahrenheit451.getAuthorName().getFullName() + ", publishingYear - " + fahrenheit451.getpublishingYear());
        System.out.println("alchemist.bookName = " + alchemist.getbookName());
        System.out.println("alchemist.authorName = " + alchemist.getAuthorName().getFullName());
        System.out.println("alchemist.publishingYear = " + alchemist.getpublishingYear());
        System.out.println("RayBradbury.fullName = " + RayBradbury.getFullName());
        System.out.println("PauloCoelho.fullName = " + PauloCoelho.getFullName());
        alchemist.setPublishingYear(1990);
        System.out.println("alchemist.getpublishingYear() = " + alchemist.getpublishingYear());
    }
}
