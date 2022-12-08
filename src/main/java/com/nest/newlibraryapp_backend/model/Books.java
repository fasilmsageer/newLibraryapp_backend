package com.nest.newlibraryapp_backend.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "books")

public class Books {

    @Id
    @GeneratedValue

    private int id;
    private String title;
    private String image;
    private String author;
    private String description;
    private String publisher;
    private String language;
    private String distributer;
    private String releasedyear;
    private String price;

    public Books(){}

    public Books(int id, String title, String image, String author, String description, String publisher, String language, String distributer, String releasedyear, String price) {
        this.id = id;
        this.title = title;
        this.image = image;
        this.author = author;
        this.description = description;
        this.publisher = publisher;
        this.language = language;
        this.distributer = distributer;
        this.releasedyear = releasedyear;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getDistributer() {
        return distributer;
    }

    public void setDistributer(String distributer) {
        this.distributer = distributer;
    }

    public String getReleasedyear() {
        return releasedyear;
    }

    public void setReleasedyear(String releasedyear) {
        this.releasedyear = releasedyear;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }
}
