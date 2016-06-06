package com.theironyard;
import javax.persistence.*;

@Entity
@Table(name = "books")
public class Book {

    @Id
    @GeneratedValue
    int id;

    @Column(nullable = false)
    String title;

    @Column(nullable = false)
    String author;

    @Column(nullable = false)
    String genre;

    public Book() {
    }

    public Book(String title, String author, String genre) {
        this.title = title;
        this.author = author;
        this.genre = genre;
    }

}
