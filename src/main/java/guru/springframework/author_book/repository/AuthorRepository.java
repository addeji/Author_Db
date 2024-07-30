package guru.springframework.author_book.repository;

import guru.springframework.author_book.entity.Author;
import org.springframework.data.repository.CrudRepository;

public interface AuthorRepository extends CrudRepository<Author, Long> {
}
