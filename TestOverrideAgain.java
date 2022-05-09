public class TestOverrideAgain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Founder f = new Chairman ();
		f.breathIn();
		f.breathOut();
		f.fear();
		f.reproduction();
		f.eat();
		f.sleep();
		f.giveBirth();
		f.think();
		f.active();
		f.study();
		f.work();
		f.execute();
		f.manage();
		f.direct();
		f.found();
		f.chaired();
		
	}

}

class LivingBeing
{
	void breathIn() { 
		System.out.println("Living Being is inhaling...");
	}
	void breathOut() { 
		System.out.println("Living Being is exhaling...");
	}
}
class Tree extends LivingBeing
{
	
}
class Animal extends LivingBeing
{
	void fear() {
		System.out.println("fear of death...");
	}
	void eat() {
		System.out.println("eating.......");
	}
	void sleep() {
		System.out.println("sleeping......");
	}
	void reproduction() {
		System.out.println("reproduction......");
	}
}
class Mammal extends Animal
{
	void giveBirth() {
		System.out.println("Mammal is giving birth....");
	}
}
class Reptile extends Animal
{
	void layEggs() {
		System.out.println("Reptile is laying eggs....");
	}
}
class Human extends Mammal
{
	void think() {
		System.out.println("Human is thinking.....");
	}
}
class Person extends Human
{
	void active() {
		System.out.println("Person is active......");	
	}
}
class Student extends Person
{
	void study() {
		System.out.println("Student is studying...");
	}
}
class Employee extends Student
{
	void work() {
		System.out.println("Employee is working......");
	}
}
class Executive extends Employee
{
	void execute() {
		System.out.println("Executive is executing......");
	}
}
class Manager extends Executive
{
	void manage() {
		System.out.println("Maanger is managing...");
	}
}
class Director extends Manager
{
	void direct() {
		System.out.println("Director is directing...");
	}

	public void found() {
				
	}
}

class Founder extends Director
{
	public void found() {
		System.out.println("Found a company.....");
		
	}

	public void chaired() {
		// TODO Auto-generated method stub
		
	}

}

class Chairman extends Founder
{
	public void chaired () {
		System.out.println("Charied the company seat.....");
			
	}
}
