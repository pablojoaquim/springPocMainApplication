package com.poc.service;

import com.poc.repository.IPersonaRepo;
import com.poc.repository.PersonaRepoImpl_B;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class PersonaServiceImpl implements IPersonaService {

    @Autowired
    @Qualifier("Persona_B")
    private IPersonaRepo repo;

    @Override
    public void register(String nombre) {
    repo.register(nombre);
    }
    
}
