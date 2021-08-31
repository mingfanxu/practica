package practica2;

import java.util.Scanner;

public class AssignState {
	public static Scanner scanner = new Scanner(System.in);
    public static ArrayList<student> students = new ArrayList<>();

    public static void main(String[] args) {
        while (true) {
            System.out.println("----------Bienvenido al sistema de calificaciones de los estudiantes-----------");
            System.out.println("-------------¡¾1¡¿Ingrese los resultados de los estudiantes-------------");
            System.out.println("-------------¡¾2¡¿Mostrar estad¨ªsticas-------------");
            System.out.println("-------------¡¾3¡¿Encuentra las calificaciones de los estudiantes-------------");
            System.out.println("-------------¡¾4¡¿Modificar las calificaciones de los estudiantes-------------");
            System.out.println("-------------¡¾0¡¿Sistema de salida-------------");
            
            Student student = new Student();

            System.out.println("ÊäÈëÄãµÄÑ¡Ôñ");
            String choice = scanner.next();
            switch (choice) {
                case "1":
                    student.addScore(students);
                    break;
                case "2":
                    student.showAvg(students);
                    break;
                case "3":
                    student.lookupStudent(students);
                    break;
                case "4":
                    student.modifyStudent(students);
                    break;
                case "0":
                    System.exit(0);
                default:
                    break;
            }
        }
    }
            
}
