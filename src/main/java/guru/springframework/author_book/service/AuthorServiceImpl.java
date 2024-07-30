package guru.springframework.author_book.service;

import guru.springframework.author_book.entity.Author;
import guru.springframework.author_book.repository.AuthorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;

@Service
public class AuthorServiceImpl implements AuthorService {

    @Autowired
    AuthorService authorService;
    @Autowired
    private AuthorRepository authorRepository;

    @Override
    public Author saveAuthor(Author author) {
        return authorRepository.save(author);
    }

    @Override
    public List<Author> fetchAuthorList() {
        return (List<Author>)
                authorRepository.findAll();
    }

    @Override
    public Author updateAuthor(Author author, Long authorId) {
        Author depDB
                = authorRepository.findById(authorId)
                .get();

        if (Objects.nonNull(author.getFirstName())
                && !"".equalsIgnoreCase(
                author.getFirstName())) {
            depDB.setFirstName(
                    author.getFirstName());
        }

        if (Objects.nonNull(
                author.getLastName())
                && !"".equalsIgnoreCase(
                author.getLastName())) {
            depDB.setLastName(
                    author.getLastName());
        }



        return authorRepository.save(depDB);
    }

    @Override
    public void deleteAuthorById(Long authorId) {
        authorRepository.deleteById(authorId);

    }
}
