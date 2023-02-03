package be.technifutur.java.DemoMongoDB.repository;

import be.technifutur.java.DemoMongoDB.models.entities.Book;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface BookRepository extends MongoRepository<Book, String> {
}
