package com.logging.testLoggers;

import com.logging.package1.Logging1;
import com.logging.package2.Logging2;
import com.logging.package3.Logging3;

public class Test {

	public static void main(String[] args) {
		
		Logging1 logging1 = new Logging1();
		Logging2 logging2 = new Logging2();
		Logging3 logging3 = new Logging3();
		
		logging1.loggingMethod();
		logging2.loggingMethod();
		logging3.loggingMethod();

	}

}
