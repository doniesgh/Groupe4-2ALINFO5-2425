package com.example.Foyer.Services.Universite;

import com.example.Foyer.DAO.Entities.Universite;

import java.util.List;

public interface IUniversiteService {
    Universite addOrUpdate(Universite u);
    List<Universite> findAll();
    Universite findById(long id);
    void deleteById(long id);
    void delete(Universite u);
//    Universite ajouterUniversiteEtSonFoyer(Universite u);
}
