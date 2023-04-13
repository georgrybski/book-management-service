package com.ecommerce.bookmanagementservice.controller;

import com.ecommerce.bookmanagementservice.dtos.BookDTO;
import com.ecommerce.bookmanagementservice.dtos.BookRegistrationDTO;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.ecommerce.bookmanagementservice.service.BookService;

import java.util.List;

@RestController
@RequestMapping("/api/books")
public class BookController {
    private BookService bookService;

     public BookController(BookService bookService) {
        this.bookService = bookService;
    }
    @GetMapping(
            produces = MediaType.APPLICATION_JSON_VALUE
    )
    public ResponseEntity<List<BookDTO>> getAllBooks() {
        return ResponseEntity.ok(bookService.fetchAllBooks());
    }

    @GetMapping(
            value = "/{id}",
            produces = MediaType.APPLICATION_JSON_VALUE
    )
    public ResponseEntity<BookDTO> getBookById(@PathVariable Long id) {
        return ResponseEntity.ok(bookService.fetchBookById(id));
    }

    @GetMapping(
            value = "/example",
            produces = MediaType.APPLICATION_JSON_VALUE
    )
    public ResponseEntity<BookRegistrationDTO> getBookRegistrationExample() {
        return ResponseEntity.ok(bookService.getBookRegistrationExample());
    }

    @PostMapping(
            consumes = MediaType.APPLICATION_JSON_VALUE
    )
    public ResponseEntity<Void> createBook(@RequestBody BookRegistrationDTO bookDTO) {
        bookService.createBook(bookDTO);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }

    @PutMapping(
            value = "/{id}",
            consumes = MediaType.APPLICATION_JSON_VALUE
    )
    public ResponseEntity<Void> updateBook(@PathVariable Long id, @RequestBody BookDTO bookDTO) {
        bookDTO.setId(id);
        bookService.updateBook(bookDTO);
        return ResponseEntity.noContent().build();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteBook(@PathVariable Long id) {
        bookService.deleteBookById(id);
        return ResponseEntity.noContent().build();
    }
}

