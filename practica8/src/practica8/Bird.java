package practica8;

public class Bird  extends Animal {
	public Bird(String name, int age){
		super(name, age);
		}

		public void eat(){
		System.out.println(name + "is eating birdseed");
		}
		public void volar(){
		System.out.println(name + "flew away");
		}


}
