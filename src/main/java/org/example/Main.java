package org.example;
import java.util.InputMismatchException;
import java.util.Scanner;
public class Main {
    public static void menu(String[] args){
        String contra = "1234";
        int [][] habitaciones = crearArreglo();
        String contra2 = "ola";
        int opcion;
        Scanner sn = new Scanner(System.in);
        while (true) {

            System.out.println("Ingrese la contraseña: ");
            contra2 = sn.nextLine();
            if (contra.equals(contra2)){
                System.out.println("1.- Reservar una habitacion");
                System.out.println("2.- Crear reserva");
                System.out.println("3.- Confirmar reserva");
                System.out.println("4.- Mostrar Habitaciones");
                System.out.println("5.- Reiniciar habitaciones");
                System.out.println("6.- Pagar habitacion");
                System.out.println("7.- Imprimir boleta");
                System.out.println("8.- Salir");()
                System.out.println("Elija una opcion: ");
                opcion = sn.nextInt();
                switch (opcion) {
                    case 1:
                        ocuparHabitacion(habitaciones);
                    case 2:
                        reservarHabitacion(habitaciones);
                    case 3:
                        confirmarReserva(habitaciones);
                    case 4:
                        mostrarHabitacion(habitaciones);
                    case 5:
                        reiniciarArreglo(habitaciones);
                        System.out.println("Habitaciones reiniciadas");
                        break;
                    case 6:
                        pagarHabitacion(habitaciones);

                    case 7:
                        imprimirBoleta(habitaciones);

                    case 8:
                        System.out.println("Gracias por usar el programa");
                        System.exit(0);
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
        return habitaciones;
    }

}


