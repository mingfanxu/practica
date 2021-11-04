package practica8;

public class Veterinarian {
	private String name;
	private double salary;
	public Veterinarian(String name, double salary){
	setSalary(salary);
	setName(name);
	}
	public void setSalary(double salary){
	this.salary = salary;
	}
	public void setName(String name){
	this.name = name;
	}
	public double getSalary(){
	return salary;
	}
	public String getName(){
	return name;
	}
	public void vacunar(Animal a){
		a.setVacuna(true);
	}
	public void revisar(Animal a){
		if(a.vacuna){
			System.out.println(a.name + " esta vacunado");
			}
		else{
			System.out.println(a.name + " no esta vacunado");
			}
	}


}
