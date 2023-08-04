package Week5InterfaceAssignment;

public class Application {

	public static void main(String[] args) {
		
		// create an instance of our logger. 
		// interface on the left side and the class name on the right side. 
		
		Logger logger = new AsteriskLogger(); 
		Logger logger2 = new SpacedLogger();
		
		
		logger.log("Happy Linus");
		logger.error("Happy Lemon");
		
		logger2.log("Linus");
		logger2.error ("Lemon");	
	
	}
	
}
