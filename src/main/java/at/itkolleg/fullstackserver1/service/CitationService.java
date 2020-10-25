package at.itkolleg.fullstackserver1.service;

import at.itkolleg.fullstackserver1.model.Author;
import at.itkolleg.fullstackserver1.model.Citation;
import at.itkolleg.fullstackserver1.repository.ICitationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class CitationService {

    @Autowired
    private ICitationRepository repo;

    public List<Citation> listAll(){
        return repo.findAll();
    }
    public void save(Citation citation){
        repo.save(citation);
    }

    public Optional<Citation> get(Long id){
        return repo.findById(id);
    }

    public void deleteById(Long id){
        repo.deleteById(id);
    }
}
