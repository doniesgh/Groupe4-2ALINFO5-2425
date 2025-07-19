package com.example.Foyer.Services.Universite;

import com.example.Foyer.DAO.Entities.Universite;
import com.example.Foyer.DAO.Repositories.UniversiteRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UniversiteService  implements IUniversiteService{
    UniversiteRepository repo;

    @Override
    public Universite addOrUpdate(Universite u) {
        return repo.save(u);
    }

    @Override
    public List<Universite> findAll() {
        return repo.findAll();
    }


    @Override
    public Universite findById(long id) {
        Optional<Universite> optionalUniversite = repo.findById(id);
        if (optionalUniversite.isPresent()) {
            return optionalUniversite.get();
        } else {
            throw new RuntimeException("Université introuvable avec l'id : " + id);
        }
    }


    @Override
    public void deleteById(long id) {
        repo.deleteById(id);
    }

    @Override
    public void delete(Universite u) {
        repo.delete(u);
    }

}
