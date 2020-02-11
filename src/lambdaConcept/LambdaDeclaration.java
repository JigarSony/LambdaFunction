package lambdaConcept;

public class LambdaDeclaration {

	public static void main(String[] args) {
		
		WebPage w1 = new WebPage() {
			
			@Override
			public void header(String value) {
				System.out.println("Hello " +value);
			}
		};
		
		WebPage w2 = new WebPage() {
			
			@Override
			public void header(String value) {
				System.out.println("Hii " +value);
			}
		};
		
		w1.header("google");
		w2.header("Facebook");
		
		/*
		 * This above all the code is just repetitive -- only business logic will be changed for that
		 * you have to do 
		 * remove from new to header
		 * 
		 * give some paraname (value) and put arrow ->
		 * remove param and brackets
		 */
		
//		WebPage w3 = (String value) -> {
//				System.out.println("Bye " +value);
//			};
		
		//in single line and remove para datatype
		
		WebPage w3 = (value) -> {System.out.println("Bye " +value);};
			
		// above is lambda expression got created
		w3.header("Orkut");
		
		//remove brackets
		WebPage w4 = (value) -> System.out.println(value.toUpperCase());
			
		w4.header("jack d.");
		
		WebPage w5 = (value) -> System.out.println(value.length());
		
		w5.header("abcdefghij");
		
		//for multi param
		//WebPage w6 = (value,age) -> System.out.println("Name is: " +value +  "and" + "Age:"+ age);
		//w6.header("Jack",20);	
	}

}
