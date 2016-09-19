package me.nasif.oa.service;

import me.nasif.oa.repository.BookRepository;
import me.nasif.oa.service.dto.BookDTO;
import me.nasif.oa.service.interfaces.BookService;
import me.nasif.oa.service.map.MapBook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class BookServiceImpl implements BookService {

    @Autowired
    private BookRepository repository;

    @Override
    public List<BookDTO> getAll() {
        return repository.findAll().stream().map(MapBook::toDTO).collect(Collectors.toList());
    }

    @Override
    public BookDTO save(BookDTO dto) {
        return MapBook.toDTO(repository.save(MapBook.toModel(dto)));
    }
}
