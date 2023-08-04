package Week5InterfaceAssignment;

public interface Logger {

	
	
	// below are the signatures of the method that we want any class that implements the interface to have. 
	
	// An interface has to have everything defined in the blue print. 
	// Each class that implements the inference has to contain elements of the blue print but can make different designs. 
	// For example if we look at an Animal a dog will bark as its sounds and a cat will meow. 

	public void log (String Log); 
	public void error (String Error); 
	
	
	
	
	
}



