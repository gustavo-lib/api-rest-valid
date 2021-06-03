package com.gortiz.restvalid.restvalid.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gortiz.restvalid.restvalid.Respository.PersonaRespoistory;
import com.gortiz.restvalid.restvalid.entity.Persona;

@Service
public class PersonaServiceImpl  implements PersonaService{

	@Autowired
	PersonaRespoistory personaRepository;
	
	@Override
	public Persona save(Persona p) {
		// TODO Auto-generated method stub
		return personaRepository.save(p);
	}

}
