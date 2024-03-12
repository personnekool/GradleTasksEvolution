package org.example;

public class Person{
    private String fname;
    private String lname;

    public Person(String fname, String lname) {
        this.fname = fname;
        this.lname = lname;
    }
    @Override
    public String toString(){
        return this.lname + ". " + this.fname;
    }
}