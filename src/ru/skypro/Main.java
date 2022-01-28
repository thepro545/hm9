package ru.skypro;

public class Main {


    public static void main(String[] args) {

//        String bookName = "Fahrenheit 451";
//        String authorName = "Ray Bradbury";
//        int publishingYear = 1953;

        Book fahrenheit451 = Book.createBook("Fahrenheit 451", "Ray Bradbury", 1953);
        Book alchemist = Book.createBook("Alchemist", "Paulo Coelho", 1988);
        System.out.println("fahrenheit451 about = bookName - " + fahrenheit451.getbookName() + ", authorName - " + fahrenheit451.getAuthorName() + ", publishingYear - " + fahrenheit451.getpublishingYear());
        System.out.println("alchemist.bookName = " + alchemist.getbookName());
        System.out.println("alchemist.authorName = " + alchemist.getAuthorName());
        System.out.println("alchemist.publishingYear = " + alchemist.getpublishingYear());

        Author RayBradbury = Author.createAuthor("Ray", "Bradbury");
        Author PauloCoelho = Author.createAuthor("Paulo","Coelho");
        System.out.println("RayBradbury.name = " + RayBradbury.getName());
        System.out.println("RayBradbury.lastName = " + RayBradbury.getLastName());
        System.out.println("PauloCoelho.name = " + PauloCoelho.getName());
        System.out.println("PauloCoelho.lastName = " + PauloCoelho.getLastName());
        alchemist.setPublishingYear(1990);
        System.out.println("alchemist.getpublishingYear() = " + alchemist.getpublishingYear());
    }
}
