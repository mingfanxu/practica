package practica7;

public class Main {
	public static void main(String[] args) {
		Magnum opus = new Magnum();
		Mini_Robot2 R1 = new Mini_Robot2();
		Mini_Robot3 R2 = new Mini_Robot3();
		
		int op;
		int i = 0;
		int accion;
		do{
		op = 0;
		accion = 0;
		do{
			System.out.println("Elige el robot deseado:");
			System.out.println("1) " + opus.getNombre());
			System.out.println("2) " + R1.getNombre());
			System.out.println("3) " + R2.getNombre());
			op = CapturaEntrada.capturaEntero("Robot ");
			if(op == 2 && R1.accionrealizada||(op == 3 && R2.accionrealizada)){
				System.out.println("Un mini robot solo puede realizar una tareq asi que el robot elegido ya la hizo, por favor vuelva a elegir otro.");
				op = CapturaEntrada.capturaEntero("Robot");
				}
			System.out.println();}while(op<=0||op>=5);
		do{
			System.out.println("Eligir accion: ");
			System.out.println("1) Ingredientes");
			System.out.println("2) Cocinar");
			System.out.println("3) Servir");
			accion = CapturaEntrada.capturaEntero("Accion");
			
			if(!(accion == (i+1))){
				System.out.println("Accion no realizada");
				accion = 0;
				}
			System.out.println();
			}while(accion>=4||accion<=0);
		if((op == 2 && accion == 2)||(op==2 && accion ==3)){
			String continuar = CapturaEntrada.capturaCadena("Robot con dos cuchillos no puede" + "realizar la accion, continuar? [S/N]");
			if(continuar.toLowerCase().equals("n")){
				System.out.println("Regresando...");
				op = 0;
				accion = 0;
				}
			}
		if((op == 3 && accion ==1)||(op==3 && accion ==3)){
			String continuar = CapturaEntrada.capturaCadena("Robot para calentar no puede realizar la accion, continuar? [S/N]");
			if(!continuar.toLowerCase().equals("s")){
				System.out.println("Regresando...");
				op = 0;
				accion = 0;
				}
			}
		switch(op){
		case 1:{
			switch(accion){
			case 1: {
				System.out.println(opus.CortarCarne());
				System.out.println(opus.PicarVerdura()); opus.setAccion("Ingredientes");
				break;
				}
			case 2:{
				System.out.println(opus.CocinarGuiso()); 
				opus.setAccion("Cocinar");
				break;
				}
			case 3:{
				System.out.println(opus.Servir()); 
				opus.setAccion("Servir");
				break;
				}
			}
		}
		break;
		case 2:{
			switch(accion){
			case 1: {
				System.out.println(R1.CortarCarne());
				System.out.println(R1.PicarVerdura());
				R1.accionEspecial = true;
				R1.setAccion("Ingredientes");
				R1.accionrealizada = true;
				break;
				}
			case 2:{
				System.out.println(R1.CocinarGuiso());
				R1.accionEspecial = false;
				R1.setAccion("Cocinar");
				R1.accionrealizada = true;
				break;
				}
			case 3:{
				System.out.println(R1.Servir());
				R1.accionEspecial = false;
				R1.setAccion("Servir");
				R1.accionrealizada = true;
				break;
				}
			}
			break;
			}
		case 3:{
			switch(accion){
			case 1: {
				System.out.println(R2.CortarCarne());
				System.out.println(R2.PicarVerdura());
				R2.accionEspecial = false;
				R2.setAccion("Ingredientes");
				R2.accionrealizada = true;
				break;
				}
			case 2:{
				System.out.println(R2.CocinarGuiso());
				R2.accionEspecial = true;
				R2.setAccion("Cocinar");
				R2.accionrealizada = true;
				break;
				}
			case 3:{
				System.out.println(R2.Servir());
				R2.accionEspecial = false;
				R2.setAccion("Servir");
				R2.accionrealizada = true;
				break;
				}
			}
			break;
			}
		}i++;
		}while(accion!=3);
		
		if(R1.getAccion() == null && R2.getAccion() == null){
			System.out.println("Magnum Opus pudo hacer todo y quedo bueno!");
			}
		else if(R1.getAccion() != null && R2.getAccion() == null){
			if(R1.accionEspecial == true){
				System.out.println("El plato quedo riqu¨ªsimo, buen trabajo!");
				}
			else{
				System.out.println("El plato pudo haber quedado mejor");
				}
			}
		else if(R1.getAccion() == null && R2.getAccion() != null){
			if(R2.accionEspecial == true){System.out.println("El plato quedo riqu¨ªsimo, buen trabajo!");
			}
			else{
				System.out.println("El plato pudo haber quedado mejor");
				}
			}
		else if(R1.accionEspecial == true && R2.accionEspecial == true){
			System.out.println("El plato quedo riqu¨ªsimo, buen trabajo!");
		}
		else if((R1.accionEspecial == false &&
		R2.accionEspecial == true)||(R1.accionEspecial == true &&
		R2.accionEspecial == false)){
			System.out.println("El plato pudo haber quedado mejor");

		}
		else if(R1.accionEspecial == false && R2.accionEspecial == false){
		System.out.println("El plato salio malo");
		}
		opus.Imprimir();
		R1.Imprimir();
		R2.Imprimir();
		}


}
