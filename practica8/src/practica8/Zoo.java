package practica8;

import java.util.ArrayList;

public class Zoo {
	private ArrayList<Animal> animals = new ArrayList<>();
	private Veterinarian v = new Veterinarian(CapturaEntrada.capturaCadena("Name for veterinarian"),CapturaEntrada.capturaDoble("Salary"));
	public void agregar(String animal){
		animal = animal.trim().toLowerCase();
		Animal a = null;
		switch(animal){
		case "dog" -> {
			a = new Dog(CapturaEntrada.capturaCadena("Name"),CapturaEntrada.capturaEntero("Age"));
			break;
			}
		case "cat" -> {
			a = new Cat(CapturaEntrada.capturaCadena("Name"),CapturaEntrada.capturaEntero("Age"));
			break;
			}
		case "sheep" -> {
			a = new Sheep(CapturaEntrada.capturaCadena("Name"),CapturaEntrada.capturaEntero("Age"));
			break;
			}
		case "rabbit" -> {
			a = new Rabbit(CapturaEntrada.capturaCadena("Name"),CapturaEntrada.capturaEntero("Age"));
			break;
			}
		case "bird" -> {
			a = new Bird(CapturaEntrada.capturaCadena("Name"),CapturaEntrada.capturaEntero("Age"));
			break;
			}
		case "cow" -> {
			a = new Cow(CapturaEntrada.capturaCadena("Name"),CapturaEntrada.capturaEntero("Age"));
			break;
			}
		default -> {
			System.out.println("Error, try again");
			}
		}
		if(a != null){
			animals.add(a);
		}
	}
	
	public void imprimir(){
		for(Animal a: animals){
		a.eat();
		v.vacunar(a);
		v.revisar(a);
		if(a instanceof Dog){
		((Dog)a).eat();
		}
		else if(a instanceof Cat){
		((Cat)a).snarl();
		}
		else if(a instanceof Sheep){
		((Sheep)a).run();
		}
		else if(a instanceof Rabbit){
		((Rabbit)a).saltar();
		}
		else if(a instanceof Bird){
		((Bird)a).volar();
		}
		else if(a instanceof Cow){
		((Cow)a).leche();
		}
		System.out.println();
		}
		}
	
	public void quitar(){
		int i = 1, op;
		for(Animal a: animals){
		System.out.println("Animal name: " + i);
		System.out.print(a.name + "\n");
		i++;
		}
		op = CapturaEntrada.capturaEntero("Enter the name: ");
		animals.remove((op-1));
		System.out.println("Erased animal.");
		}



}
