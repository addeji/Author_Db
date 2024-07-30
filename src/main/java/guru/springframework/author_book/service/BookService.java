package guru.springframework.author_book.service;

import guru.springframework.author_book.entity.Book;

import java.util.List;

public interface BookService {

    Book saveBook(Book book);

    // Read operation
    List<Book> fetchBookList();

    // Update operation
    Book updateBook(Book Book,
                        Long bookId);

    // Delete operation
    void deleteBookById(Long bookId);
}
