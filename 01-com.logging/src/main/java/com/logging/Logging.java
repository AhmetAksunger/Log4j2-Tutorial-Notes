package com.logging;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Logging {
	
	private static final Logger logger = LogManager.getLogger();
	
	public static void main(String[] args) {
		insertPersonal("Ahmet");
	}
	
	public static void insertPersonal(String name) {
		logger.info("User has been added to database " + name);
	}

}
