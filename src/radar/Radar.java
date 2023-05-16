package radar;

import java.util.Scanner;

public class Radar {

public static void main(String[] args) {
    
        // Le hago una primera modificacion al codigo para GitHub 
        Scanner sc = new Scanner(System.in);

        float recorrido = 0F;

        float tiempo = 0F;

        float veloci = 0F;

        int difVelocidad = 0;

        int velMax = 0;

        int puntos = 0;

        recorrido = sc.nextFloat();

        velMax = sc.nextInt();

        tiempo = sc.nextFloat();

        recorrido = recorrido / 1000;

        tiempo = tiempo / 3600;

        veloci = recorrido / tiempo;



        difVelocidad = (int) ((veloci - velMax) / 10);

        if (veloci <= velMax) {

            System.out.println("OK");

        } else {

            if (difVelocidad == 0) {

                puntos = 0;
            } else if (difVelocidad == 1) {

                puntos = 2;
            } else if (difVelocidad == 2) {

                puntos = 4;
            } else if (difVelocidad == 3) {

                puntos = 7;
            } else if (difVelocidad == 4) {

                puntos = 10;
            }
            System.out.println("MULTA - " + puntos + " puntos");

        }

    }

}