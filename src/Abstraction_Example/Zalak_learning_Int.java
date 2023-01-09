package Abstraction_Example;

public class Zalak_learning_Int extends Prashant_learning_Ins{

	@Override
	public void trial_sessions() {
		// TODO Auto-generated method stub
		
		System.out.println("We would delivery this in a day on 6hours session");
				
	}
	
	public void api_sessions() {
		
		
		System.out.println("I won't deliver this in this branch");
	}

	
public void manual_sessions(String name) {
		
		System.out.println("Its better to start with manual sessions which will be delivered by "+name);
		
		

	}



	
	//the rule here would be Zalak_learning_Int class must implement the abstract method from prashant_learning_ins class
	
	
	//but other two methods are not mandatory to implement 
	
	
	//this is called partial Abstraction achieved 
	
	

}
