package com.Twisted_Code.witchery.util;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger; //for some reason this wasn't offered for automatic import. Eclipse being stupid I guess?
import com.Twisted_Code.witchery.Reference;

public class Utils {
	
	private static Logger logger;
	public static Logger getLogger() {
		if(logger == null) {
			logger = LogManager.getFormatterLogger(Reference.MODID);
		}
		return logger;
	}

}
