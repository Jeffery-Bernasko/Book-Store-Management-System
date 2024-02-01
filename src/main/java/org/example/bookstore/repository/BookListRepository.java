package org.example.bookstore.repository;

import org.example.bookstore.model.BookList;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookListRepository extends JpaRepository<BookList, Integer> {
}