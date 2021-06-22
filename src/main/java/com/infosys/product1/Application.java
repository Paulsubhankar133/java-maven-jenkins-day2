package com.infosys.product1;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Application {
	static final Logger logger = LoggerFactory.getLogger(Application.class);
	public static void main(String[] args)
	{
//		System.out.println("HEllo Maven");
		logger.trace("trace message");
		logger.debug("this is a debug message");
		logger.info("this is a info message");
		logger.warn("this is warn msg");
		logger.error("this is a error msg");
	}
}
