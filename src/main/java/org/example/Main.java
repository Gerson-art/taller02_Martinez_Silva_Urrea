package org.example;

import java.util.Scanner;
import java.util.ArrayList;


import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        int [][] Arr = new int [10][2];
        for(int i=0; i< Arr.length; i++) {
            for(int j=0; j< Arr[i].length; j++) {
                Arr[i][j] = 0;
            }
        }
    }
    public static void pagarHabitacion( int [][] arr ) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese la habitacion en la cual se hospedo");
        int habitacion = sc.nextInt();
        for(int i=0; i< arr.length; i++) {
                if(arr[i][0] == habitacion) {
                    arr[i][0] = 0;
            }
        }



        }
        public static void imprimirBoleta(int [][] arr, int habitacion) {
            for (int i = 0; i < arr.length; i++) {

                }
            }
        }
    }
