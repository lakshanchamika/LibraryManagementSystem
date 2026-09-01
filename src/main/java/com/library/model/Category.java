package com.library.model;

public class Category {

    private int categoryId;
    private String categoryName;
    private String description;
    private boolean active;

    //Constructor
    public Category() {

    }

    //Getter
    public int getCategoryId() {
        return categoryId;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public String getDescription() {
        return description;
    }

    public boolean isActive() {
        return active;
    }

    //Setter
    public void setCategoryId(int categoryId) {
        this.categoryId = categoryId;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setActive(boolean active) {
        this.active = active;
    }
}

