package super_keyword;

public class All_Animals {

	public static void main(String[] args) {
		
		//creating a object of dog class with object reference mydog 
	
		//this will also call the default constructor from dog class. 
		
		Dog mydog=new Dog();
		
		//mydog object calls make_noise function
		//at runtime it checks the method is called from dog class reference so calls 
		//method from dog class and not from parent class
		//method overriding --
	
		mydog.make_noise();
		
		//Question: why I will make noise when hungry is displayed ??
		

	}

}
