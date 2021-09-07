package practica3;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Mexican {
	static Scanner scanner = new Scanner(System.in);
	//ID

		public static void main(String[] args) {
			Mexican idCard = new Mexican();
			boolean flag = true;
			while (flag) {
				flag = idCard.menu();			
			}
		}
		
		private boolean menu() {
			boolean flag = true;
			System.out.println("************");
			System.out.println("1-CHECK YOUR ID");
			System.out.println("2-Quit");
			System.out.println("************");
			String order = scanner.nextLine();
			if (!is_rightorder(order)) {
				flag = false;
			}
			if (Integer.valueOf(order) == 1)
				operation();
			return flag;
		}
		
		private void operation() {
			System.out.println("Ingresar su id card");
			String id = scanner.nextLine();
			if (!check_id(id)) {
				String adress = openFile(id);// direccion
				if(adress ==null) {
					System.out.println("No existe");
					return ;
				}
				String birth = getBirth(id);// nacieonamiento
				String security = id.substring(14,16);//codigo del direccion
				String sex = getSex(id.substring(16,17));
				System.out.println("Direccion£º"+adress+"\nNacionamiento£º"+birth+"\nCodigo por parte£º"+security+"\nSexo£º"+sex);
			}
		}
	private boolean check_id(String id) {
			// TODO Auto-generated method stub
			return false;
		}

	private String openFile(String id) {
			// TODO Auto-generated method stub
			return null;
		}

	//sexo
		private String getSex(String sex) {
			if(Integer.valueOf(sex)%2==0) {
				return "woman";
			}
			return "man";
		}
	//nacionamiento
		private String getBirth(String id) {
			String birth = id.substring(6,10)+"year"+id.substring(10,12)+"month"+id.substring(12,14)+"day";
			return birth;
		}

		// checar esta correcto o no
		private boolean is_rightorder(String order) {
			int o = Integer.valueOf(order);
			if ("".equals(order)) {
				return false;
			}
			if (o < 1 || o >= 2) {
				return false;
			}
			return true;
		}

}
