package ru.skypro;

public class Author {
    public static String fullName;
    private final String name;
    private final String lastName;

    public Author (String name, String lastName){
        this.name = name;
        this.lastName = lastName;
        String fullName = name + " " + lastName;
    }
    public String getName(){
        return name;
    }
    public String getLastName(){
        return lastName;
    }
}
