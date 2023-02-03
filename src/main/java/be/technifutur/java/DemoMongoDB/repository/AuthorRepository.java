package be.technifutur.java.DemoMongoDB.repository;

import be.technifutur.java.DemoMongoDB.models.entities.Author;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface AuthorRepository extends MongoRepository<Author, String> {
}
