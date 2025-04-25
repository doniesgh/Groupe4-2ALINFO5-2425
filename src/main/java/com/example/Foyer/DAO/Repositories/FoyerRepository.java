package com.example.Foyer.DAO.Repositories;

import com.example.Foyer.DAO.Entities.Foyer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FoyerRepository extends JpaRepository<Foyer, Long> {
    Foyer findByNomFoyer(String nom);

    // select * from Foyer where capaciteFoyer > ....
    List<Foyer> findByCapaciteFoyerGreaterThan(int capacite);

    // select * from Foyer where capaciteFoyer < ....
    List<Foyer> findByCapaciteFoyerLessThan(int capacite);

    // select * from Foyer where capaciteFoyer < .... and capaciteFoyer> ....
    List<Foyer> findByCapaciteFoyerBetween(int min, int max);

    // Afficher le foyer de l'université dont son nom est passé en paramétre.
    // select f from Foyer f JOIN Universite u ON <Condition de jointure> where
    // <condition>
    Foyer findByUniversiteNomUniversite(String nom);

    // Afficher la liste des foyers qui comportent des chambres de meme type
    // que le type passé en paramétre

    @Query("select f from Foyer f Join Bloc b On b.foyer.idFoyer" +
            "=f.idFoyer where b.nomBloc=?1")
    List<Foyer> find(String nomF);

}
