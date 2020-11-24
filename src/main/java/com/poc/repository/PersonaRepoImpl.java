package com.poc.repository;

import com.poc.MainApplication;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;;

@Repository
public class PersonaRepoImpl implements IPersonaRepo {

    private static Logger mLogger = LoggerFactory.getLogger(MainApplication.class);

    @Override
    public void register(String nombre) {
        mLogger.info(nombre + " has been registered");
    }

    
}
