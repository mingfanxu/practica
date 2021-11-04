package practica8;

public class Animal {
	String name;
	int age;
	boolean vacuna;
	public Animal(String name, int age){
	this.name = name;
	this.age = age;
	}
	public void eat(){
	System.out.println(name +" eatting");
	}
	public void sleep(){
	System.out.println(name + " eatting");
	}
	public void setVacuna(boolean vacuna){
	this.vacuna = vacuna;
	}

}
