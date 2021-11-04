package practica8;

public class Sheep  extends Animal {
	public Sheep(String name, int age){
		super(name, age);
		}
		public void eat(){
		System.out.println(name + "is eating grass");
		}
		public void run(){
		System.out.println(name + "he galloped away");
		}

}
