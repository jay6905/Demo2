package Interface_abstraction;

public class Deepti_Training_Centre implements SkillToDevelop {
	
	//implements is the keyword you will be using when class is extending interface

	public static void main(String[] args) {
		
		Deepti_Training_Centre  firstcentre=new Deepti_Training_Centre();
		
		firstcentre.trial_sessions();
		firstcentre.manual_sessions();
		String message=firstcentre.api_sessions();
		System.out.println(message);
		}
		
	//all functions on interface must be overridden here. 
	//100 percent abstraction 

	@Override
	public void trial_sessions() {
		
		System.out.println("We would deliver these over 6 hours sessions");	
	}

	@Override
	public void manual_sessions() {
		
		System.out.println("Is Free");		
	}

	@Override
	public String api_sessions() {
		String msg="this is optional";
		return msg;
	}}

}
