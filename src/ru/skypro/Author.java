package ru.skypro;

public class Author {
    private final String name;
    private final String lastName;

    public Author (String name, String lastName){
        this.name = name;
        this.lastName = lastName;
    }
    public String getName(){
        return name;
    }
    public String getLastName(){
        return lastName;
    }
    public String getFullName(){
        String fullName = name + " " + lastName;
        return fullName;
    }
}
