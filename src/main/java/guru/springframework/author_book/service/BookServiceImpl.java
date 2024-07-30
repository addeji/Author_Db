package guru.springframework.author_book.service;


import guru.springframework.author_book.entity.Author;
import guru.springframework.author_book.entity.Book;

import guru.springframework.author_book.repository.AuthorRepository;
import guru.springframework.author_book.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;

@Service
public class BookServiceImpl implements BookService {

    @Autowired
    BookService bookService;
    @Autowired
    private BookRepository bookRepository;

    @Override
    public Book saveBook(Book book) {
        return bookRepository.save(book);
    }

    @Override
    public List<Book> fetchBookList() {
        return (List<Book>)
                bookRepository.findAll();
    }

    @Override
    public Book updateBook(Book book, Long bookId) {
        Book depDB
                = bookRepository.findById(bookId)
                .get();

        if (Objects.nonNull(book.getBookname())
                && !"".equalsIgnoreCase(
                book.getBookname())) {
            depDB.setBookname(
                    book.getBookname());
        }

        if (Objects.nonNull(
                book.getIsbn())
                && !"".equalsIgnoreCase(
                book.getIsbn())) {
            depDB.setIsbn(
                    book.getIsbn());
        }



        return bookRepository.save(depDB);
    }

    @Override
    public void deleteBookById(Long bookId) {
        bookRepository.deleteById(bookId);

    }
}
