package me.nasif.oa.controller;


import me.nasif.oa.response.BaseResponse;
import me.nasif.oa.response.ResponseFactory;
import me.nasif.oa.service.dto.BookDTO;
import me.nasif.oa.service.interfaces.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/book")
public class BookController {

    @Autowired
    private BookService bookService;


    @RequestMapping(method = RequestMethod.GET)
    public @ResponseBody
    BaseResponse getAllBooks() {
        List<BookDTO> books = bookService.getAll();
        return new ResponseFactory<List<BookDTO>>().getResponse(1, "message", books);
    }

//    @RequestMapping(method = RequestMethod.POST)
//    public  BaseResponse createBook(@RequestBody Map<String, Object> bookMap) {
//        Book book = new Book(bookMap.get("name").toString(), bookMap.get("author").toString());
//
//        Map<String, Object> response = new LinkedHashMap<>();
//        response.put("message", "Book created successfully");
//        response.put("book", bookRepository.save(book));
//        return response;
//    }
}
