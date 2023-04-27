package com.logging.package3;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Logging3 {

	private static final Logger logger = LogManager.getLogger();
	
	public static void main(String[] args) {
		

	}

	public static void loggingMethod() {
		logger.fatal("Logging3 logged successfully");
	}
	
}
