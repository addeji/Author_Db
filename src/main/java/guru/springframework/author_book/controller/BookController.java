package guru.springframework.author_book.controller;

import guru.springframework.author_book.entity.Book;
import guru.springframework.author_book.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
public class BookController {
    @Autowired
    private BookService bookService;

    // Save operation
    @PostMapping("/books")
    public Book saveBook(
            @RequestBody Book book)
    {
        return bookService.saveBook(book);
    }

    // Read operation
    @GetMapping("/books")
    public List<Book> fetchBookList()
    {
        return bookService.fetchBookList();
    }

    // Update operation
    @PutMapping("/books/{id}")
    public Book
    updateBook(@RequestBody Book book,
                 @PathVariable("id") Long bookId)
    {
        return bookService.updateBook(
                book, bookId);
    }

    // Delete operation
    @DeleteMapping("/books/{id}")
    public String deleteBookById(@PathVariable("id")
                                   Long bookId)
    {
        bookService.deleteBookById(
                bookId);
        return "Deleted Successfully";
    }
}
