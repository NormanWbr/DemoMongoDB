package be.technifutur.java.DemoMongoDB.service;

import be.technifutur.java.DemoMongoDB.models.entities.Author;
import be.technifutur.java.DemoMongoDB.repository.AuthorRepository;
import org.springframework.stereotype.Service;

@Service
public class AuthorService {
    private final AuthorRepository repository;

    public AuthorService(AuthorRepository repository) {
        this.repository = repository;
    }

    public String insert(Author author){
        Author entity = this.repository.save(author);
        return entity.getId();
    }
}
