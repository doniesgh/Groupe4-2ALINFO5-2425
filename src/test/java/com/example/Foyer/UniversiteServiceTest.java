package com.example.Foyer;

import com.example.Foyer.DAO.Entities.Universite;
import com.example.Foyer.DAO.Repositories.UniversiteRepository;
import com.example.Foyer.Services.Universite.UniversiteService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

class UniversiteServiceTest {

    @Mock
    private UniversiteRepository repo;

    @InjectMocks
    private UniversiteService universiteService;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    void addOrUpdate_ShouldSaveAndReturnUniversite() {
        Universite u = new Universite();
        when(repo.save(u)).thenReturn(u);
        Universite result = universiteService.addOrUpdate(u);
        assertEquals(u, result);
        verify(repo, times(1)).save(u);
    }

    @Test
    void findAll_ShouldReturnAllUniversites() {
        List<Universite> universites = Arrays.asList(new Universite(), new Universite());
        when(repo.findAll()).thenReturn(universites);
        List<Universite> result = universiteService.findAll();
        assertEquals(universites, result);
        verify(repo, times(1)).findAll();
    }

    @Test
    void findById_ShouldReturnUniversiteWhenFound() {
        Universite u = new Universite();
        when(repo.findById(1L)).thenReturn(Optional.of(u));
        Universite result = universiteService.findById(1L);
        assertEquals(u, result);
        verify(repo, times(1)).findById(1L);
    }

    @Test
    void findById_ShouldThrowExceptionWhenNotFound() {
        when(repo.findById(1L)).thenReturn(Optional.empty());
        assertThrows(RuntimeException.class, () -> universiteService.findById(1L));
        verify(repo, times(1)).findById(1L);
    }

    @Test
    void deleteById_ShouldCallDeleteByIdOnRepo() {
        universiteService.deleteById(1L);
        verify(repo, times(1)).deleteById(1L);
    }

    @Test
    void delete_ShouldCallDeleteOnRepo() {
        Universite u = new Universite();
        universiteService.delete(u);
        verify(repo, times(1)).delete(u);
    }

//    @Test
//    void ajouterUniversiteEtSonFoyer_ShouldSaveAndReturnUniversite() {
//        Universite u = new Universite();
//        when(repo.save(u)).thenReturn(u);
//        Universite result = universiteService.ajouterUniversiteEtSonFoyer(u);
//        assertEquals(u, result);
//        verify(repo, times(1)).save(u);
//    }
}