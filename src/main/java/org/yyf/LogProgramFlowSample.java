package org.yyf;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
 
public class LogProgramFlowSample {

	private Logger logger = LogManager.getLogger(LogProgramFlowSample.class.getName());
	
	public void doItA() {
		logger.entry();
		this.doItB();
		logger.exit();
	}
	
	private void doItB() {
		logger.entry();
		this.doItC();
		logger.exit();
	}
	
	private void doItC() {
		logger.entry();
		System.out.println("DONE");
		logger.exit();
	}
	
	
	public static void main(String[] args) {
		LogProgramFlowSample sample = new LogProgramFlowSample();
		sample.doItA();
	}
}