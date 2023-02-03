package be.technifutur.java.DemoMongoDB.controllers;

import be.technifutur.java.DemoMongoDB.models.entities.Author;
import be.technifutur.java.DemoMongoDB.models.entities.Book;
import be.technifutur.java.DemoMongoDB.service.BookService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/book")
public class BookController {

    private final BookService service;

    public BookController(BookService service) {
        this.service = service;
    }

    @PostMapping("/{idAuthor}")
    public String insert(@RequestBody Book book, @PathVariable("idAuthor") String idAuthor) {
        return this.service.insert(book, idAuthor);
    }

    @GetMapping
    public List<Book> getAll(){
        return this.service.getAll();
    }
}
