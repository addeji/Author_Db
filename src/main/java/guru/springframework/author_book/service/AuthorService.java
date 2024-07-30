package guru.springframework.author_book.service;

import guru.springframework.author_book.entity.Author;

import java.util.List;

public interface AuthorService {

    Author saveAuthor(Author author);

    // Read operation
    List<Author> fetchAuthorList();

    // Update operation
    Author updateAuthor(Author author,
                                Long authorId);

    // Delete operation
    void deleteAuthorById(Long authorId);
}


