package org.example;
import java.util.Scanner;
public class Main {
    public static void menu(String[] args){
        String contra = "1234";
        String contra2 = "ola";
        int opcion;
        Scanner sn = new Scanner(System.in);
        while (true) {
            int [][] habitaciones = crearArreglo();
            System.out.println("Ingrese la contraseña: ");
            contra2 = sn.nextLine();
            if (contra.equals(contra2)){
                System.out.println("1.- Reservar una habitacion");
                System.out.println("2.- Confirmar reserva");
                System.out.println("3.- Cancelar reserva");
                System.out.println("4.- Mostrar Habitaciones");
                System.out.println("5.- Reiniciar habitaciones");
                System.out.println("5.- Salir");
                System.out.println("Elija una opcion: ");
                opcion = sn.nextInt();
                switch (opcion) {
                    case 1:


                    case 2:

                    case 3:

                    case 4:

                    case 5:
                        reiniciarArreglo(habitaciones);
                        System.out.println("Habitaciones reiniciadas");
                        break;
                    case 6:
                        System.exit(0);
                    default:
                        System.out.println("Opcion no valida");
                        break;
                }

            }



        }


    }

    public static int[][] crearArreglo (){
        int [][] habitaciones = new int[10][2];
        for (int i = 0; i < habitaciones.length; i++) {
            for (int j = 0; j < habitaciones[i].length; j++) {
                habitaciones[i][j] = 0;
            }
        }
        return habitaciones;
    }
    public static int [][] reiniciarArreglo(int [][] habitaciones){
        for (int i = 0; i < habitaciones.length; i++) {
            for (int j = 0; j < habitaciones[i].length; j++) {
                habitaciones[i][j] = 0;
            }
        }
    }
}

