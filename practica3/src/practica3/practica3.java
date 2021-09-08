package practica3;

public class practica3 {
	public static void main(String[] args) {
        mexicano[] persona = new mexicano[2];
        
        for(int i=0;i<2;i++)
        {
            System.out.println("Mexicano " + (i+1));
            persona[i] = new mexicano();
        }
        System.out.println("CURP: " + persona[0].getCURP());
        System.out.println("RFC: " + persona[1].getRFC());
        System.out.println("CURP y RFC : "+ persona[1].getCURP() + "\n Y "+ persona[1].getRFC());
	}

}
