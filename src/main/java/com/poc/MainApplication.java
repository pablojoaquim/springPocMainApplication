package com.poc;

import com.poc.service.IPersonaService;
import com.poc.service.PersonaServiceImpl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MainApplication implements CommandLineRunner {

	private static Logger mLogger = LoggerFactory.getLogger(MainApplication.class);
	private IPersonaService service = new PersonaServiceImpl();

	public static void main(String[] args) {
		SpringApplication.run(MainApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		mLogger.info("information");
		mLogger.warn("warning");

		service.register("pepe");
	}

}
