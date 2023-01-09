package Interface_abstraction;

public interface SkillToDevelop {
	
	public abstract void trial_sessions(); //method is abstract in nature : abstract key word used or not
	
	public void manual_sessions(); //abstract 

	public String api_sessions(); //can have return type but need to be overridden on same way
	
	

}


//note: methods cannot be static as static method cannot be override. You will get compile-time error. 