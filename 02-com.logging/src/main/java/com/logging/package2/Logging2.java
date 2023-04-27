package com.logging.package2;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Logging2 {

	private static final Logger logger = LogManager.getLogger();
	
	public static void main(String[] args) {
		

	}
	
	public static void loggingMethod() {
		logger.warn("Logging2 logged successfully");
	}
}
