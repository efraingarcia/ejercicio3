package ejer103;

import java.util.Scanner;

public class Ejer103 {

    public static void main(String[] args) {

        int altura[] = new int[300];
        int nacionalidad[] = new int[300];
        int edad[] = new int[300];
        int contador1 = 0, contador2 = 0, contador3 = 0;
        int contador4 = 0, contador5 = 0, contador6 = 0;
        int cont = 0;
        for (int i = 0; i < 10; i++) {
            altura[i] = (int) (Math.random() * (3) + 1);
            nacionalidad[i] = (int) (Math.random() * (3) + 1);
            edad[i] = (int) (Math.random() * (99) + 1);
        }
        for (int j = 0; j < 10; j++) {
            if (altura[j] == 1) {
                cont++;
            }
            if (altura[j] == 1 && nacionalidad[j] == 3) {
                contador1++;
            }
            if (altura[j] == 2 && nacionalidad[j] == 2) {
                contador2++;
            }
            if (altura[j] == 3 && nacionalidad[j] == 1) {
                contador3++;
            }
            if (nacionalidad[j] == 1) {
                contador4++;
            }
            if (nacionalidad[j] == 2 && edad[j] < 30) {
                contador5++;
            }
            if (nacionalidad[j] == 1 && altura[j] == 2 && edad[j] < 40) {
                contador6++;
            }
        }

        System.out.println("Estatura");
        for (int i = 0; i < 10; i++) {
            System.out.print("[" + altura[i] + "]");
        }
        System.out.println("\nNacionalidad");
        for (int i = 0; i < 10; i++) {
            System.out.print("[" + nacionalidad[i] + "]");
        }
        System.out.println("\nEdad");
        for (int i = 0; i < 10; i++) {
            System.out.print("[" + edad[i] + "]");
        }

        System.out.println("");
        System.out.println("alto :" + cont);
        System.out.println("\nIndues altos : " + contador1);
        System.out.println("latinos medianos : " + contador3);
        System.out.println("Germanos bajos : " + contador2);
        System.out.println("Total latinos : " + contador4);
        System.out.println("Total germanos menores de 30 : " + contador5);
        System.out.println("Total latinos bajos menores de 40 : " + contador6);

    }
}
