package com.example.Foyer.RestControllers;

import com.example.Foyer.DAO.Entities.Foyer;
import com.example.Foyer.DAO.Entities.Universite;
import com.example.Foyer.Services.Foyer.IFoyerService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("foyer")
@AllArgsConstructor
public class FoyerRestController {
    IFoyerService service;

    @PostMapping("addOrUpdate")
    Foyer addOrUpdate(@RequestBody Foyer f) {
        return service.addOrUpdate(f);
    }

    @GetMapping("findAll")
    List<Foyer> findAll() {
        return service.findAll();
    }

    @GetMapping("findById")
    Foyer findById(@RequestParam long id) {
        return service.findById(id);
    }

    @DeleteMapping("delete")
    void delete(@RequestBody Foyer f) {
        service.delete(f);
    }

    @DeleteMapping("deleteById")
    void deleteById(@RequestParam long id) {
        service.deleteById(id);
    }

//    @PutMapping("affecterFoyerAUniversite")
//    Universite affecterFoyerAUniversite(@RequestParam long idFoyer, @RequestParam String nomUniversite) {
//        return service.affecterFoyerAUniversite(idFoyer, nomUniversite);
//    }

//    @PutMapping("desaffecterFoyerAUniversite")
//    Universite desaffecterFoyerAUniversite(@RequestParam long idUniversite){
//        return service.desaffecterFoyerAUniversite(idUniversite);
//    }

//    @PostMapping("ajouterFoyerEtAffecterAUniversite")
//    Foyer ajouterFoyerEtAffecterAUniversite(@RequestBody Foyer foyer,@RequestParam long idUniversite) {
//        return service.ajouterFoyerEtAffecterAUniversite(foyer,idUniversite);
//    }
//
//    @PutMapping("affecterFoyerAUniversite/{idF}/{idU}")
//    Universite affecterFoyerAUniversite(@PathVariable long idF,@PathVariable long idU){
//        return service.affecterFoyerAUniversite(idF,idU);
//    }
}
