package com.doikota.nexus_hello;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.doikota.maven_sonar.App;

public class Main {
	
	static Logger logger = LoggerFactory.getLogger(Main.class);

	public static void main(String[] args) {
    	App app = new App();
    	String h = app.helloWorld(); 
        logger.info(h);
	}

	public String hello() {
    	App app = new App();
		return app.helloWorld();
	}
}
