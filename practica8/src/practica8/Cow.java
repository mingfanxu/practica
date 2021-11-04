package practica8;

public class Cow extends Animal {
	public Cow(String name, int edad){
		super(name, edad);
		}

		public void eat(){
		System.out.println(name + "is grazing");
		}
		public void leche(){
		System.out.println(name + "is being milked");
		}


}
