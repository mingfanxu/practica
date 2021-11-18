package practica9;

import java.util.Scanner;

public class CapturaEntrada {
	public static int capturaEntero(String msg){
		Scanner sc = new Scanner(System.in);
		System.out.print(""+msg+": ");
		return (sc.nextInt());
		}
	
		public static float capturaFlotante(String msg){
		Scanner sc = new Scanner(System.in);
		System.out.print(""+msg+": ");
		return (sc.nextFloat());
		}
		
		public static double capturaDoble(String msg){
		Scanner sc = new Scanner(System.in);
		System.out.print(""+msg+": ");
		return (sc.nextDouble());
		}
		
		public static String capturaCadena(String msg){
		Scanner sc = new Scanner(System.in);
		System.out.print(""+msg+": ");
		return (sc.nextLine());
		}


}
