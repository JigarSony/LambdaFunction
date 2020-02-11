package lambdaConcept;

@FunctionalInterface
public interface WebPage {
	
	//single param
	void header(String value);
	
	//multi param
	//void details(String value,int age);
	
	//FunctionalInterface : 
	//It only allows (lambda) one single method abstraction 
	
	//It called SAM: Single Abstract Method 
	//It is FunctionalInterface and lambda only applies on SAM
}
