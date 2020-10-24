package at.itkolleg.fullstackserver1.service;

import java.util.List;
import java.util.Optional;

import at.itkolleg.fullstackserver1.model.Author;
import at.itkolleg.fullstackserver1.repository.IAuthorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class AuthorService {

    @Autowired
    private IAuthorRepository repo;

    public List<Author> listAll(){
        return repo.findAll();
    }

    public void save(Author author){
        repo.save(author);
    }

    public Optional<Author> get(int id){
        return repo.findById(id);
    }

    public void deleteById(int id){
        repo.deleteById(id);
    }
}
