package practica1;

import java.util.Scanner;

public class ScoreList {
	int maxLength = 100;
    int length = 0;
    Score[] data = new Score[maxLength];

    Scanner input = new Scanner(System.in);

    public ScoreList() {

    }

    //Agregar metodo de grabaci¨®n
    public void add() {
        if (length < maxLength) {
            data[length] = new Score();
            System.out.print("Ingrese la identificacion del estudiante£º ");
            data[length].setNum(input.next());
            System.out.print("Ingrese el nombre del estudiante£º");
            data[length].setName(input.next());
            System.out.print("Ingrese las calificaciones del estudiante£º");
            data[length].setScore(input.nextDouble());
            length++;
            System.out.println("Agregado exitosamente");
        } else {
            System.out.println("No se pudo agregar");
        }
    }

    //calificacion
    public void transcript() {
        System.out.println("=====================================");
        System.out.println(" Matricula      nombre       calificacion ");
        for (int i = 0; i < length; i++) {
            System.out.println(data[i].getNum() + "\t" + data[i].getName() + "\t" + "\t" + data[i].getScore());
        }
        System.out.println("=====================================\n");
    }

    //calificacion alto a bajo
    public void sort() {
        Score temp = new Score();
        
        for (int i = 1; i < length; i++) {
            for (int j = 0; j < length - i; j++) {
                if (data[j].getScore() < data[j + 1].getScore()) {
                    temp = data[j];
                    data[j] = data[j + 1];
                    data[j + 1] = temp;
                }

            }
        }
    }

    // pormedio
    public void average() {
        double sum = 0.0;
        double max = 0.0;
        double min = 100.0;
        for (int i = 0; i < length; i++) {
            sum += data[i].getScore();
            
            max = max > data[i].getScore() ? max : data[i].getScore();
            min = min < data[i].getScore() ? min : data[i].getScore();
        }
        System.out.printf("Este materia calificacion por medio es: %.2f\n", sum / length);
        System.out.println("califcacion alto: " + max + "\n" + "calificacion bajo: " + min + "\n");
    }
}
