package ru.skypro;

public class Author {
    private String name;
    private String lastName;

    public static Author createAuthor(String name, String lastName){
        Author author = new Author();
        author.name = name;
        author.lastName = lastName;
        return author;
    }
    public String getName(){
        return name;
    }
    public String getLastName(){
        return lastName;
    }
}
