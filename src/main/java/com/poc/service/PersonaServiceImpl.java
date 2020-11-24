package com.poc.service;

import com.poc.repository.IPersonaRepo;
import com.poc.repository.PersonaRepoImpl;

public class PersonaServiceImpl implements IPersonaService {
    private IPersonaRepo repo = new PersonaRepoImpl();

    @Override
    public void register(String nombre) {
    repo.register(nombre);
    }
    
}
