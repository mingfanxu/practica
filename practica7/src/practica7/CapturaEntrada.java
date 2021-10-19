package practica7;

import java.util.*;

//This class allows capturing imput from the terminal/console, entered by the user
//This class uses the Java Scanner class to get imput from terminal/console
//All methods are "static", they are "class methods", so to create objects from this class is not necessary to use these methods.

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
