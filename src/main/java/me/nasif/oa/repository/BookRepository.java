package me.nasif.oa.repository;

import me.nasif.oa.repository.model.Book;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface BookRepository extends MongoRepository<Book, String> {

}
