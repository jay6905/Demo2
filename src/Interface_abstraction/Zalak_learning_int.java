package Interface_abstraction;

public class Zalak_learning_int implements Prashant_learning_Ins {
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("I have my own institute");
		
		Zalak_learning_int India= new Zalak_learning_int();
		
		India.manual_sessions();
		India.trial_sessions();
		India.api_sessions();
		
		
		
			
	}
//here I am implementing the rules given by prashsnt
	
	//here i am going to define the business rules or implementation logic for the abstract methods

	@Override
	public void trial_sessions() {
		System.out.println("we deliver there this 6 hours sessions ");
		// TODO Auto-generated method stub
		
	}

	@Override
	public void manual_sessions() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void api_sessions() {
		// TODO Auto-generated method stub
		
	}
	


		
		
	};

