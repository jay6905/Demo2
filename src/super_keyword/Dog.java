package super_keyword;

public class Dog extends Animal {
	
	//class Dog is the child class of parent class Animal
	//extends key word is used to use inheritance in Java
	
	
	//constructor defined on child class
	Dog(){
		
		super(); //super word can be used to call constructor from parent class
		System.out.println("Welcome to dog");
	}
	
	public void make_noise() {
		
		//imporant: super keyword can be used to refer to base/parent class Animal
	    //super here =make_noise method from parent class
		
		super.make_noise();
		
		System.out.println("i will say worf worf if i am hungry");
		
		
	}

}
