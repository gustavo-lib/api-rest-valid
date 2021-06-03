package com.gortiz.restvalid.restvalid.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gortiz.restvalid.restvalid.Service.PersonaService;
import com.gortiz.restvalid.restvalid.entity.Persona;

@RestController
@RequestMapping("/api/")
public class ControllerRest {

	@Autowired
    PersonaService personaService;
	
	@PostMapping("save")
	public ResponseEntity<Persona> create(@Valid @RequestBody Persona persona) {
		//per
        Persona nuevo = personaService.save(persona);
        return new ResponseEntity(nuevo, HttpStatus.CREATED);
    }
}
