package com.library.model;

public class Book {
    private String bookID;
    private String bookName;
    private String Author;
    private int ISBN;
    private String Category;
    private String Publisher;
    private int publisherYear;
    private int Quantity;
    private int availableQuantity;
    private String shelfLocation;

    public Book() {

    }

    // Getter

    public String getBookID() {
        return bookID;
    }

    public String getBookName() {
        return bookName;
    }

    public String getAuthor() {
        return Author;
    }

    public int getISBN() {
        return ISBN;
    }

    public String getCategory() {
        return Category;
    }

    public String getPublisher() {
        return Publisher;
    }

    public int getPublisherYear() {
        return publisherYear;
    }

    public int getQuantity() {
        return Quantity;
    }

    public int getAvailableQuantity() {
        return availableQuantity;
    }

    public String getShelfLocation() {
        return shelfLocation;
    }

    //Setter

    public void setBookID(String bookID) {
        this.bookID = bookID;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public void setAuthor(String Author) {
        this.Author = Author;
    }

    public void setISBN(int ISBN) {
        this.ISBN = ISBN;
    }

    public void setCategory(String Category) {
        this.Category = Category;
    }

    public void setPublisher(String Publisher) {
        this.Publisher = Publisher;
    }

    public void setPublisherYear(int publisherYear) {
        this.publisherYear = publisherYear;
    }

    public void setQuantity(int Quantity) {
        this.Quantity = Quantity;
    }

    public void setAvailableQuantity(int availableQuantity) {
        this.availableQuantity = availableQuantity;
    }

    public void setShelfLocation(String shelfLocation) {
        this.shelfLocation = shelfLocation;
    }
}
