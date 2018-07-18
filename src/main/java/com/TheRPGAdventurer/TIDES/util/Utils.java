package com.TheRPGAdventurer.TIDES.util;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.TheRPGAdventurer.TIDES.Tides;

public class Utils {
	
	private static Logger logger;
	
	public static Logger getLogger() {
		if(logger == null) {
			logger = LogManager.getFormatterLogger(Tides.MODID);
		}
		return logger;
	}
	
}
