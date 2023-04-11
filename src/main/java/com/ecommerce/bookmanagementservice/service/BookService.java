package com.ecommerce.bookmanagementservice.service;

import com.ecommerce.bookmanagementservice.mapper.BookMapper;
import com.ecommerce.bookmanagementservice.repository.BookRepository;
import com.ecommerce.bookmanagementservice.dtos.BookDTO;
import com.ecommerce.bookmanagementservice.dtos.BookRegistrationDTO;
import lombok.AllArgsConstructor;
import com.ecommerce.bookmanagementservice.model.Book;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;

@Service
@AllArgsConstructor
public class BookService {
    private BookRepository bookRepository;
    private BookMapper bookMapper;

    public Book createBook(BookRegistrationDTO bookDTO) {
        Book book = bookMapper.toEntity(bookDTO);
        return bookRepository.save(book);
    }

    public List<BookDTO> fetchAllBooks() {
        return bookRepository.findAll()
                             .stream()
                             .map(bookMapper::toDTO)
                             .toList();
    }

    public BookDTO fetchBookById(Long id) {
        Book book = bookRepository.findById(id)
                             .orElseThrow(() -> new RuntimeException("No book with id %s found".formatted(id)));
        return bookMapper.toDTO(book);
    }

    public Book updateBook(BookDTO bookDTO) {
        fetchBookById(bookDTO.getId());
        Book book = bookMapper.toEntity(bookDTO);
        return bookRepository.save(book);
    }

    public void deleteBookById(Long id) {
        fetchBookById(id);
        bookRepository.deleteById(id);
    }

    public BookRegistrationDTO getBookRegistrationExample() {
        return BookRegistrationDTO.builder()
                .title("Example title")
                .author("Example author")
                .isbn("Example isbn")
                .publisher("Example publisher")
                .language("Example language")
                .description("Example description")
                .publicationDate("Example publication date")
                .numberOfPages(100)
                .category("Example category")
                .price(BigDecimal.valueOf(100))
                .genre("Example genre")
                .build();
    }
}

