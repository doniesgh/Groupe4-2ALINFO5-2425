package com.example.Foyer.DAO.Repositories;

import com.example.Foyer.DAO.Entities.Universite;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDate;
import java.util.List;

public interface UniversiteRepository extends JpaRepository<Universite, Long> {
    Universite findByNomUniversite(String nomUniversite);
    List<Universite> findByFoyerBlocsChambresReservationsEtudiantsNomEtLikeAndFoyerBlocsChambresReservationsEtudiantsDateNaissanceBetween(String nom, LocalDate date1, LocalDate date2);
    List<Universite> findByFoyerCapaciteFoyerLessThan(long u);

}
