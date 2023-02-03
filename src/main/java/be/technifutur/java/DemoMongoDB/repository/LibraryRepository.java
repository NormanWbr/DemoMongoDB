package be.technifutur.java.DemoMongoDB.repository;

import be.technifutur.java.DemoMongoDB.models.entities.Library;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface LibraryRepository extends MongoRepository<Library, String> {
}
