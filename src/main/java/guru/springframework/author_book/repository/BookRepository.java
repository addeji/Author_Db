package guru.springframework.author_book.repository;

import guru.springframework.author_book.entity.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<Book,Long> {
}
