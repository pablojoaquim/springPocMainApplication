package com.poc.repository;

import com.poc.MainApplication;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;;

@Repository
@Qualifier("Persona_B")
public class PersonaRepoImpl_B implements IPersonaRepo {

    private static Logger mLogger = LoggerFactory.getLogger(MainApplication.class);

    @Override
    public void register(String nombre) {
        mLogger.info(nombre + " is  Persona B and has been registered");
    }

    
}
