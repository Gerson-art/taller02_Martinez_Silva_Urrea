package org.example;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[][] habitaciones = new int[10][2];
        reservarHabitacion(habitaciones);
        ocuparHabitacion(habitaciones);
        mostrarHabitacion(habitaciones);
        reservarHabitacion(habitaciones);
        mostrarHabitacion(habitaciones);
        confirmarReserva(habitaciones);
        mostrarHabitacion(habitaciones);
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
        }
    }
}
