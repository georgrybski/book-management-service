package com.ecommerce.bookmanagementservice.mapper;

import com.ecommerce.bookmanagementservice.dtos.BookDTO;
import com.ecommerce.bookmanagementservice.dtos.BookRegistrationDTO;
import com.ecommerce.bookmanagementservice.mapper.config.MappingConfig;
import com.ecommerce.bookmanagementservice.model.Book;
import org.mapstruct.Mapper;
import org.springframework.stereotype.Component;

@Component
@Mapper(componentModel = "spring")
public interface BookMapper {
    Book toEntity(BookDTO bookDTO);
    BookDTO toDTO(Book book);
    Book toEntity(BookRegistrationDTO bookRegistrationDTO);
}

