package org.example;


import java.util.InputMismatchException;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
    }
    public static int pedirInt(){
        Scanner teclado = new Scanner(System.in);
        try {
            return teclado.nextInt();
        }catch (InputMismatchException e){
            System.out.println("Ingrese un número, por favor");
            return pedirInt();
        }
    }
    public static int preguntarDias(){
        System.out.println("Ingrese cantidad de días");
        int ans = pedirInt();
        if (ans>0){
            return ans;
        }else {
            System.out.println("Ingrese un número mayor a 0, por favor");
            return preguntarDias();
        }
    }

    public static int preguntarAlimentacion(){
        System.out.println("[0] Habitación sin alimentación \n[1] Habitación con alimentación");
        int ans = pedirInt();
        int estado = 0;
        switch (ans) {
            case 0:
                estado = 2;
                break;
            case 1:
                estado = 3;
                break;
            default:
                System.out.println("Ingrese una opción valida, por favor");
                return preguntarAlimentacion();
        }return estado;
    }
    public static int preguntarHabitacion(){
        System.out.println("Ingrese el número de habitación [1-10]");
        int ans = pedirInt();
        if (ans>0 && ans<=10){
            return ans-1;
        }else{
            System.out.println("Ingrese un número de habitacion válida, por favor");
            return preguntarHabitacion();
        }
    }
    public static int[][] ocuparHabitacion(int[][] habitaciones) {
        int habitacion = preguntarHabitacion();
        if (habitaciones[habitacion][1] == 0) {
            int alimentacion = preguntarAlimentacion();
            int dias = preguntarDias();

            habitaciones[habitacion][0] = alimentacion;
            habitaciones[habitacion][1] = dias;

            return habitaciones;
        }else {
            System.out.println("La habitación está ocupada");
            return habitaciones;
        }
    }
    public static void mostrarHabitacion(int[][] habitaciones){
        for (int i = 0; i <habitaciones.length ; i++) {
            for (int j = 0; j < habitaciones[i].length; j++) {
                System.out.print(habitaciones[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static int[][] reservarHabitacion(int[][] habitaciones){
        int habitacion = preguntarHabitacion();
        if (habitaciones[habitacion][0] == 0 ){
            int dias = preguntarDias();
            habitaciones[habitacion][0] = 1;
            habitaciones[habitacion][1] = dias;
            return habitaciones;
        }else {
            System.out.println("La habitación está ocupada");
            return habitaciones;
        }
    }
    public static int[][] confirmarReserva(int[][] habitaciones){
        int habitacion = preguntarHabitacion();
        if (habitaciones[habitacion][0] == 1){
            int alimentacion = preguntarAlimentacion();
            habitaciones[habitacion][0] = alimentacion;
            return habitaciones;
        }else {
            System.out.println("La habitación no está reservada");
            return habitaciones;

import java.util.InputMismatchException;
import java.util.Scanner;

  public static void main(String[] args) {
        menu();
    }
    public static void menu(){
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
                System.out.println("8.- Salir");
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
    
