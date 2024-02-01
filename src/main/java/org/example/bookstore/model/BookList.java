package org.example.bookstore.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
public class BookList {
    @Id
    private Integer id;

    private String title;

    private String author;

    private Double price;
}
