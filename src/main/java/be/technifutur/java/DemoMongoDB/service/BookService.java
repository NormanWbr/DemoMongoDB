package be.technifutur.java.DemoMongoDB.service;

import be.technifutur.java.DemoMongoDB.models.entities.Author;
import be.technifutur.java.DemoMongoDB.models.entities.Book;
import be.technifutur.java.DemoMongoDB.repository.AuthorRepository;
import be.technifutur.java.DemoMongoDB.repository.BookRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {
    private final BookRepository bookRepository;
    private final AuthorRepository authorRepository;

    public BookService(BookRepository repository, AuthorRepository authorRepository) {
        this.bookRepository = repository;
        this.authorRepository = authorRepository;
    }

    public String insert(Book book, String idAuthor) {
        Book entity = this.bookRepository.save(book);
        Author author = this.authorRepository.findById(idAuthor).orElseThrow();
        author.getBooks().add(entity);
        this.authorRepository.save(author);
        return entity.getId();
    }

    public List<Book> getAll() {
        return this.bookRepository.findAll();
    }
}
