package be.technifutur.java.DemoMongoDB.models.entities;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
@Getter @Setter
public class Author {
    @Id
    private String id;
    private String firstName;
    private String lastName;
}
