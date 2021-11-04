package practica8;

public class Main {
	public static void main(String[] args) {
		int op;
		Zoo zoo = new Zoo();
		do{
			System.out.println("Choose option ");
			System.out.println("1) Add");
			System.out.println("2) Remove");
			System.out.println("3) Show");
			System.out.println("4) Get out");
			op = CapturaEntrada.capturaEntero("Option");
			switch(op){
			case 1:{
				zoo.agregar(CapturaEntrada.capturaCadena("Add"));
				break;
				}
			case 2:{
				zoo.quitar();
				break;
				}
			case 3:{
				zoo.imprimir();
				break;
				}
			}
			}while(op!=4);
		}
}
