package be.technifutur.java.DemoMongoDB.controllers;

import be.technifutur.java.DemoMongoDB.models.entities.Book;
import be.technifutur.java.DemoMongoDB.models.entities.Library;
import be.technifutur.java.DemoMongoDB.service.LibraryService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/library")
public class LibraryController {

    private final LibraryService service;

    public LibraryController(LibraryService service) {
        this.service = service;
    }

    @GetMapping
    public List<Library> getAll(){
        return this.service.getAll();
    }

    @PostMapping()
    public String insert(@RequestBody Library library) {
        return this.service.insert(library);
    }

    @PostMapping("/addbook/{idLibrary}/{idBook}")
    public String insertBook(@PathVariable("idLibrary") String idLibrary, @PathVariable("idBook") String idBook) {
        return this.service.insertBook(idLibrary, idBook);
    }

    @GetMapping("{idLibrary}")
    public List<Book> getAllBooks(@PathVariable("idLibrary") String idLibrary) {
        return this.service.getAllBooks(idLibrary);
    }
}
