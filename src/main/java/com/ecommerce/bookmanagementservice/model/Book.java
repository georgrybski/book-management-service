package com.ecommerce.bookmanagementservice.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
@Entity
@Table(name = "book")
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "book_id")
    private Long id;
    @Column(name = "title")
    private String title;
    @Column(name = "author")
    private String author;
    @Column(name = "isbn")
    private String isbn;
    @Column(name = "publisher")
    private String publisher;
    @Column(name = "language")
    private String language;
    @Column(name = "description")
    private String description;
    @Column(name = "publication_date")
    private String publicationDate;
    @Column(name = "number_of_pages")
    private Integer numberOfPages;
    @Column(name = "category")
    private String category;
    @Column(name = "price")
    private BigDecimal price;
    @Column(name = "genre")
    private String genre;
}
