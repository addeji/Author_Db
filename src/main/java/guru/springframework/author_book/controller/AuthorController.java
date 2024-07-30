package guru.springframework.author_book.controller;

import guru.springframework.author_book.entity.Author;
import guru.springframework.author_book.service.AuthorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class AuthorController {
    @Autowired
    private AuthorService authorService;

    // Save operation
    @PostMapping("/author")
    public Author saveAuthor(
            @RequestBody Author author)
    {
        return authorService.saveAuthor(author);
    }

    // Read operation
    @GetMapping("/author")
    public List<Author> fetchAuthorList()
    {
        return authorService.fetchAuthorList();
    }

    // Update operation
    @PutMapping("/author/{id}")
    public Author
    updateAuthor(@RequestBody Author author,
                     @PathVariable("id") Long authorId)
    {
        return authorService.updateAuthor(
                author, authorId);
    }

    // Delete operation
    @DeleteMapping("/author/{id}")
    public String deleteAuthorById(@PathVariable("id")
                                       Long authorId)
    {
        authorService.deleteAuthorById(
                authorId);
        return "Deleted Successfully";
    }
}
