package com.ecommerce.bookmanagementservice.dtos;

import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
public class BookDTO {
    private Long id;
    private String title;
    private String author;
    private String isbn;
    private String publisher;
    private String language;
    private String description;
    private String publicationDate;
    private Integer numberOfPages;
    private String category;
    private BigDecimal price;
    private String genre;
}
