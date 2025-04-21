package com.example.Foyer.Services.Foyer;

import com.example.Foyer.DAO.Entities.Foyer;
import com.example.Foyer.DAO.Entities.Universite;

import java.util.List;

public interface IFoyerService {
    Foyer addOrUpdate(Foyer f);

    List<Foyer> findAll();

    Foyer findById(long id);

    void deleteById(long id);

    void delete(Foyer f);

//    Universite affecterFoyerAUniversite(long idFoyer, String nomUniversite);
//
//    Universite desaffecterFoyerAUniversite(long idUniversite);
//
//    Foyer ajouterFoyerEtAffecterAUniversite (Foyer foyer, long idUniversite); // Universite: Parent / Foyer:Child
//    Foyer ajoutFoyerEtBlocs(Foyer foyer);
//
//    Universite affecterFoyerAUniversite(long idF, long idU);

}
