package ru.skypro;

public class Main {


    public static void main(String[] args) {

        Book fahrenheit451 = new Book("Fahrenheit 451", new Author("Ray", "Bradbury"), 1953);
        Book fahrenheit452 = new Book("Fahrenheit 451", new Author("Ray", "Bradbury"), 1953);
        Book alchemist = new Book("Alchemist", new Author("Paulo","Coelho"), 1988);
        Author RayBradbury = new Author("Ray", "Bradbury");
        Author PauloCoelho = new Author("Paulo","Coelho");
        System.out.println("fahrenheit451 about = bookName - " + fahrenheit451.getBookName() + ", authorName - " + fahrenheit451.getAuthorName().getFullName() + ", publishingYear - " + fahrenheit451.getPublishingYear());
        System.out.println("alchemist.bookName = " + alchemist.getBookName());
        System.out.println("alchemist.authorName = " + alchemist.getAuthorName().getFullName());
        System.out.println("alchemist.publishingYear = " + alchemist.getPublishingYear());
        System.out.println("RayBradbury.fullName = " + RayBradbury.getFullName());
        System.out.println("PauloCoelho.fullName = " + PauloCoelho.getFullName());
        alchemist.setPublishingYear(1990);
        System.out.println("alchemist.getPublishingYear() = " + alchemist.getPublishingYear());

//Task HM10
        System.out.println(fahrenheit451);
        System.out.println(fahrenheit451.equals(fahrenheit452));
        System.out.println(fahrenheit451.hashCode());
    }
}
