package com.nhj.inheritance.polymorphisme.quivalency;

public class Book {
    String ISBN;
    
    public Book() {}
    
    public Book(String isbn) {
    	ISBN = isbn;
    }
    
    public String getISBN() { 
        return ISBN;
    }
    
    public boolean equals(Object obj) {
        if (obj instanceof Book)
            return ISBN.equals(((Book)obj).getISBN()); 
        else
            return false;
    }
}