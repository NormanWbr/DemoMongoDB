package be.technifutur.java.DemoMongoDB.service;

import be.technifutur.java.DemoMongoDB.models.entities.Book;
import be.technifutur.java.DemoMongoDB.models.entities.Library;
import be.technifutur.java.DemoMongoDB.repository.BookRepository;
import be.technifutur.java.DemoMongoDB.repository.LibraryRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class LibraryService {

    private final LibraryRepository libraryRepository;

    private final BookRepository bookRepository;

    public LibraryService(LibraryRepository libraryRepository, BookRepository bookRepository, BookRepository bookRepository1) {
        this.libraryRepository = libraryRepository;
        this.bookRepository = bookRepository1;
    }

    public List<Library> getAll() {
        return this.libraryRepository.findAll();
    }

    public String insert(Library library) {
        library.setBooks(new ArrayList<>());
        Library entity = this.libraryRepository.save(library);
        return entity.getId();
    }

    public String insertBook(String idLibrary, String idBook) {
        Library entity = this.libraryRepository.findById(idLibrary).get();
        entity.getBooks().add(this.bookRepository.findById(idBook).get());
        this.libraryRepository.save(entity);
        return entity.getId();
    }
}
