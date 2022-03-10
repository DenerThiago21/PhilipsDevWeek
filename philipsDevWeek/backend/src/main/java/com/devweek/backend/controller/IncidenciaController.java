package com.devweek.backend.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.devweek.backend.Entity.Incidencia;
import com.devweek.backend.repository.IncidenciaRepo;
@RestController
@RequestMapping("/api")
public class IncidenciaController {
	private final IncidenciaRepo irepository;

    public IncidenciaController(IncidenciaRepo irepository) {
        this.irepository = irepository;
    }

    @GetMapping("/incidencias")
    public ResponseEntity<List<Incidencia>> findIncidencias(){
        List<Incidencia> listaIncidencia = irepository.findAll();
        if (listaIncidencia.isEmpty())
            return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
        return new ResponseEntity<>(listaIncidencia, HttpStatus.OK);
    }

    @GetMapping("/incidencia/{id}")
    public ResponseEntity<Incidencia> findOcorrenciasById(@PathVariable Long id){
        Optional<Incidencia> ocorrenciaOptional = irepository.findById(id);
        if (ocorrenciaOptional.isPresent()){
            Incidencia ocorrenciaUnid = ocorrenciaOptional.get();
            return new ResponseEntity<>(ocorrenciaUnid, HttpStatus.OK);
        }
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }
    
    @PostMapping("/incidencia/novo")
    public Incidencia newIncidencia(@RequestBody Incidencia newIncidencia){
    	return irepository.save(newIncidencia);
    }

}
