package super_keyword;

public class Animal {
	
	//class animal has one function make_noise()
	//this is non static method as static method cannot be overridden in subclass
	//And I want to override this on Dog child class
	
	//defining a constructor 
	public Animal() {
		
		System.out.println("Welcome to Animal kingdom::: says Animal constructor");
		
		
	}
	
	
	public void make_noise(){
		
		System.out.println("I will make noise when hungry");
		
		
	}

}
