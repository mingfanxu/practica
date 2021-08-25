package practica1;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String choice = "1";
        ScoreList studentScoreList = new ScoreList();
        System.out.println("****************************************");
        while (choice.equals("0") == false) {
            System.out.println("1.Ver las transcripciones de los estudiantes");
            System.out.println("2.Agregar registro de estudiante");
            System.out.println("3.Cuente los puntajes promedio, mas alto y mas bajo de este curso");
            System.out.println("4.Ordenar por grados de mayor a menor y salida");
            System.out.println("5.salir");
            System.out.print("Enter your choice: ");
            choice = input.next();

            switch (choice) {
                case "0":
                    System.out.println("Gracias tus usado\n" + "**********espacio**********");
                    break;

                case "1":
                    studentScoreList.transcript();
                    System.out.println("Que ayudas se necesita£¿\n");
                    break;

                case "2":
                    int i = 1;
                    do {
                        studentScoreList.add();
                        System.out.println("\nQuieres seguir agregando£¿" + "\n" + "0.No" + "\n" + "1.Si");
                        i = input.nextInt();
                    } while (i == 1);
                    System.out.println("Que otros servicios necesitas£¿\n");
                    break;

                case "3":
                    studentScoreList.average();
                    System.out.println("Que otros servicios necesitas£¿\n");
                    break;

                case "4":
                    studentScoreList.sort();
                    studentScoreList.transcript();
                    System.out.println("Que otros servicios necesitas£¿\n");
                    break;

                default:
                    System.out.println("Invalid input! Please enter again.");
                    break;
            }

        }
    }

}
