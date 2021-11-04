package practica8;

public class Cat extends Animal {

    public Cat(String name, int age) {
        super(name,age);
    }

    public void eat() {

        System.out.println("cat " + name +"Cat eat fish");
    }
    public void snarl(){
    	System.out.println("cat " + name + " snarl");
    	}

	

}
