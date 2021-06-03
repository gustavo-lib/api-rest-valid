package com.gortiz.restvalid.restvalid.Respository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gortiz.restvalid.restvalid.entity.Persona;

public interface PersonaRespoistory extends JpaRepository<Persona, Long> {

}
