package com.poc.service;

import com.poc.repository.IPersonaRepo;
import com.poc.repository.PersonaRepoImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonaServiceImpl implements IPersonaService {

    @Autowired
    private IPersonaRepo repo;

    @Override
    public void register(String nombre) {
    repo.register(nombre);
    }
    
}
