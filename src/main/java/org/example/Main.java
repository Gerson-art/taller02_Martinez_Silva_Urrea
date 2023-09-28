package org.example;

import java.util.Scanner;
import java.util.ArrayList;


import java.util.ArrayList;

public class Main {

    public static int [][] pagarHabitacion( int [][] arr, int habitacion ) {
        Scanner sc = new Scanner(System.in);

        for(int i=0; i< arr.length; i++) {
                if(arr[i][0] == habitacion) {
                    arr[i][0] = 0;
            }
                System.out.println("Se ha pagado exitosamente la habitación");
        }
        return arr;



        }
        public static IllegalArgumentException validarHabitacion( int habitacison) {
            if(habitacison <= 1 || habitacison >= 10) {
                throw new IllegalArgumentException("La habitacion debe estar entre 1 y 10");
            }
            return null;
        }

        public static ArrayIndexOutOfBoundsException validarArreglo(int [][] arr) {
            int cont=0;
            for(int i=0; i< arr.length; i++) {
            for(int j=0; j< arr[i].length; j++) {
                cont+=1;
                }
            }
            if(cont == 20) {
                throw new ArrayIndexOutOfBoundsException("El arreglo esta vacio");
            } else{
                return null;
            }



        }

    public static void imprimirBoleta(int [][] arr, int habitacion) {
            double valor=0;
        switch (arr[habitacion][0]) {
            case 2:
                valor = 30000 * arr[habitacion + 1][1];
                break;
            case 3:
                valor = 45000 * arr[habitacion + 1][1];

                break;
            default:
                System.out.println("Opcion no valida");
        }
        switch (arr[habitacion][0]) {

            case 2:
                System.out.println(" Cantidad de noches hospedadas: "+arr[habitacion+1][1]);
                System.out.println("El hospedaje fue del tipo: Sin comida");
                System.out.println("Monto total a pagar:"+valor);
                break;
            case 3:
                System.out.println(" Cantidad de noches hospedadas: "+arr[habitacion+1][1]);
                System.out.println("El hospedaje fue del tipo: Sin comida");
                System.out.println("Monto total a pagar:"+valor);
                break;
        }



    }

    public static void mostrarHabitaciones(int [][] arr){
        System.out.println("Estado de habitaciones: ");
        for(int i=0; i< arr.length; i++) {
            for(int j=0; j< arr[i].length; j++) {
                System.out.println(arr[i][j]);
            }
        }


    }






}

