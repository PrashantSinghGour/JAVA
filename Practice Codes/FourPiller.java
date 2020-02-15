abstract class Animal
{
	private int legs=4;
	public abstract void speak();
	public void dispLegs()
	{
		System.out.println("I have "+this.legs+" legs");
	}
}

/*
 * dispLegs method will be inherited so example of "Inheritance"
 * class is hiding legs variable so "Encapsulation"
 * abstract method is example of "Abstraction"
 * speak method is providing different forms so, "Polymorphism"
 * */


class Dog extends Animal         
{
	
	public void speak()
	{
		System.out.println("Dog Barks");
	}
}

class Cat extends Animal
{
	@Override
	public void speak() {
		// TODO Auto-generated method stub
	System.out.println("cat Meow");	
	}
}


public class Demo 
{
	public static void poly(Animal obj) {
		// TODO Auto-generated method stub
			obj.speak();
	}
	public static void main(String[] args) {
		
		poly(new Dog());
		poly(new Cat());
	}
}