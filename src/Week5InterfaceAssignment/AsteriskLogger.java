package Week5InterfaceAssignment;

import java.util.Date;

public class AsteriskLogger implements Logger {

	@Override
	public void log(String Log) {
		Date date = new Date();      // added this is so we have a time and date stamp.
		 System.out.println("Log - "+ date.toString() + ":" + "***" + Log + "***");
		
	}

	@Override
	public void error(String Error) {
		Date date = new Date();            // added this is so we have a time and date stamp.
		System.out.println("Error - "+ date.toString() + ":" + "\n" + "****************" +  " \n" + "***"  + Error + "***" + "\n" + "****************");
		
	}

	   // implements key word implements the interface
	   //double click on Asterisk Logger to add the unimplemented methods from the logger interface. 
	   // using the "/n" tp crate a new line so the error would read correctly
	
	
	
}
