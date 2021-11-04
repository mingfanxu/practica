package practica8;

public class Dog  extends Animal {
	public Dog(String name, int age){
		super(name,age);
		}

		public void eat(){
		System.out.println(name + "Dog eat meat");
		}
		public void pickedBall(){
		System.out.println(name + " picked up the ball ");
		}


}
