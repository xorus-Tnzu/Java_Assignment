import java.lang.*;

class Animal
{
	private String name;
	private int age;
	
	public Animal(String name,int age)
	{
		this.name=name;
		this.age=age;
	}
	public void displayInfo()
	{
		System.out.println("Animal Name: "+name);
		System.out.println("Animal Age: "+age);
	}
	public void makeSound()
	{
		System.out.println("Animal makes sound.");
	} 
}
class Dog extends Animal
{
	private String breed;
	
	public Dog(String name,int age,String breed)
	{
		super(name,age);
		this.breed=breed;
	}
	@Override
	public void displayInfo()
	{
		super.displayInfo();
		System.out.println("Dog breed: "+breed);
	}
	@Override
	public void makeSound()
	{
		System.out.println("Dog barks: Woof Woof!");
	}
}
class Puppy extends Dog
{
	private boolean hasMilkTeeth;
	
	public Puppy(String name,int age,String breed,boolean hasMilkTeeth)
	{
		super(name,age,breed);
		this.hasMilkTeeth=hasMilkTeeth;
	}
	@Override
	public void displayInfo()
	{
		super.displayInfo();
		System.out.println("hasMilkTeeth: "+((hasMilkTeeth==true)?"Yes":"No"));
	}
	@Override
	public void makeSound()
	{
		System.out.println("Puppy barks: Yip Yip!");
	}
}
public class Assignment4Q1
{
	public static void main(String args[])
	{

		Animal animal = new Animal("Generic Animal", 5);
        	Dog dog = new Dog("Dante", 3, "Labrador");
        	Puppy puppy = new Puppy("Coco", 1, "BullDog", true);

        	System.out.println("=== Animal Info ===");
        	animal.displayInfo();
        	animal.makeSound();

        	System.out.println("\n=== Dog Info ===");
        	dog.displayInfo();
        	dog.makeSound();

        	System.out.println("\n=== Puppy Info ===");
        	puppy.displayInfo();
        	puppy.makeSound();

	}
}
/*
OUTPUT:
H:\Java_Assignment\Assignment_4>javac Assignment4Q1.java

H:\Java_Assignment\Assignment_4>java Assignment4Q1
=== Animal Info ===
Animal Name: Generic Animal
Animal Age: 5
Animal makes sound.

=== Dog Info ===
Animal Name: Dante
Animal Age: 3
Dog breed: Labrador
Dog barks: Woof Woof!

=== Puppy Info ===
Animal Name: Coco
Animal Age: 1
Dog breed: BullDog
hasMilkTeeth: Yes
Puppy barks: Yip Yip!
*/