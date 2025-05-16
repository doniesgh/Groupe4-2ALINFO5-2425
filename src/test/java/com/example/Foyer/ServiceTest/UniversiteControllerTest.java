//package com.example.Foyer.ServiceTest;
//import com.example.Foyer.DAO.Entities.Universite;
//import com.example.Foyer.RestControllers.UniversiteRestController;
//import com.example.Foyer.Services.Universite.IUniversiteService;
//import org.junit.jupiter.api.BeforeEach;
//import org.junit.jupiter.api.Test;
//import org.mockito.InjectMocks;
//import org.mockito.Mock;
//import org.mockito.MockitoAnnotations;
//import org.springframework.http.MediaType;
//import org.springframework.test.web.servlet.MockMvc;
//import org.springframework.test.web.servlet.setup.MockMvcBuilders;
//
//import java.util.Arrays;
//import java.util.List;
//import java.util.Optional;
//
//import static org.mockito.Mockito.*;
//import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
//import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;
//public class UniversiteControllerTest {
//
//    private MockMvc mockMvc;
//
//    @Mock
//    private IUniversiteService universiteService;
//
//    @InjectMocks
//    private UniversiteRestController universiteRestController;
//
//    @BeforeEach
//    void setUp() {
//        MockitoAnnotations.openMocks(this);
//        mockMvc = MockMvcBuilders.standaloneSetup(universiteRestController).build();
//    }
//
//    @Test
//    void testFindAll() throws Exception {
//        List<Universite> universites = Arrays.asList(
//                Universite.builder().idUniversite(1L).nomUniversite("Université A").adresse("Adresse A").build(),
//                Universite.builder().idUniversite(2L).nomUniversite("Université B").adresse("Adresse B").build()
//        );
//
//        when(universiteService.findAll()).thenReturn(universites);
//
//        mockMvc.perform(get("/universite/findAll"))
//                .andExpect(status().isOk())
//                .andExpect(jsonPath("$[0].nomUniversite").value("Université A"))
//                .andExpect(jsonPath("$[1].nomUniversite").value("Université B"));
//
//        verify(universiteService, times(1)).findAll();
//    }
//
////    @Test
////    void testFindById() throws Exception {
////        Universite universite = Universite.builder().idUniversite(1L).nomUniversite("Université A").adresse("Adresse A").build();
////        when(universiteService.findById(1L)).thenReturn(universite);
////
////        mockMvc.perform(get("/universite/findById")
////                        .param("id", "1"))
////                .andExpect(status().isOk())
////                .andExpect(jsonPath("$.nomUniversite").value("Université A"));
////
////        verify(universiteService, times(1)).findById(1L);
////    }
//
////    @Test
////    void testAddOrUpdate() throws Exception {
////        Universite universite = Universite.builder().idUniversite(1L).nomUniversite("Université A").adresse("Adresse A").build();
////        when(universiteService.addOrUpdate(any(Universite.class))).thenReturn(universite);
////
////        mockMvc.perform(post("/universite/addOrUpdate")
////                        .contentType(MediaType.APPLICATION_JSON)
////                        .content("{\"nomUniversite\": \"Université A\", \"adresse\": \"Adresse A\"}"))
////                .andExpect(status().isOk())
////                .andExpect(jsonPath("$.nomUniversite").value("Université A"));
////
////        verify(universiteService, times(1)).addOrUpdate(any(Universite.class));
////    }
//
//    @Test
//    void testDeleteById() throws Exception {
//        doNothing().when(universiteService).deleteById(1L);
//
//        mockMvc.perform(delete("/universite/deleteById")
//                        .param("id", "1"))
//                .andExpect(status().isOk());
//
//        verify(universiteService, times(1)).deleteById(1L);
//    }
//
//    @Test
//    void testDelete() throws Exception {
//        doNothing().when(universiteService).delete(any(Universite.class));
//
//        mockMvc.perform(delete("/universite/delete")
//                        .contentType(MediaType.APPLICATION_JSON)
//                        .content("{\"idUniversite\": 1}"))
//                .andExpect(status().isOk());
//
//        verify(universiteService, times(1)).delete(any(Universite.class));
//    }
//}
