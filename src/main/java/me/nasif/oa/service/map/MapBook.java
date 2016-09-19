package me.nasif.oa.service.map;

import me.nasif.oa.repository.model.Book;
import me.nasif.oa.service.dto.BookDTO;

public class MapBook {

    public static BookDTO toDTO(Book model){
        return new BookDTO(model.getTitle(), model.getAuthor());
    }

    public static Book toModel(BookDTO dto){
        return new Book(dto.getTitle(), dto.getAuthor());
    }
}
