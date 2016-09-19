package me.nasif.oa.service.interfaces;

import me.nasif.oa.service.dto.BookDTO;

import java.util.List;

public interface BookService {
    List<BookDTO> getAll();
    BookDTO save(BookDTO book);
}
