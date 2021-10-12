package practica6;

import java.util.Scanner;

public class CapturaEntrada {
	public static int capturarEntero(String msg){
		Scanner sc = new Scanner(System.in);
		System.out.print(""+msg+": ");
		return (sc.nextInt());
		}
		public static float capturarFlotante(String msg){
		Scanner sc = new Scanner(System.in);
		System.out.print(""+msg+": ");
		return (sc.nextFloat());
		}
		public static double capturarDoble(String msg){
		Scanner sc = new Scanner(System.in);
		System.out.print(""+msg+": ");
		return (sc.nextDouble());
		}
		public static String capturarCadena(String msg){
		Scanner sc = new Scanner(System.in);
		System.out.print(""+msg+": ");
		return (sc.nextLine());
		}
		public static char capturarChar(String msg)
		{
		Scanner sc = new Scanner(System.in);
		System.out.print(""+msg+": ");
		return (sc.nextLine().charAt(0));
		}
	

}
