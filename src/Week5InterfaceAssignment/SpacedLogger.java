package Week5InterfaceAssignment;

import java.util.Date;

public class SpacedLogger implements Logger {

	@Override
	public void log(String Log) {
		Date date = new Date();       // added this is so we have a time and date stamp.
		 System.out.println("Log - "+ date.toString() + ":" + Log.replaceAll(".(?!$)", "$0  ").trim());
		
	}

	@Override
	public void error(String Error) {
		Date date = new Date();       // added this is so we have a time and date stamp. 
		 System.out.println("Log - "+ date.toString() + ":" + "ERROR" + ":" + " " + Error.replaceAll(".(?!$)", "$0  ").trim());
		
		
	}

}
