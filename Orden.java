package com.mycompany.orden;
public class Orden {
 public static void main(String[] args) {
 int[] arreglo = {10, 20, 30, 40, 50};
 for (int i = 0; i < arreglo.length - 1; i++) { 
 for (int j = 0; j < arreglo.length - 1 - i; j++) { 
 if (arreglo[j] < arreglo[j + 1]) {
     int temp = arreglo[j];
arreglo[j] = arreglo[j + 1];
arreglo[j + 1] = temp;
 }
 }
 }
 System.out.print("Arreglo ordenado de mayor a menor: ");
 for (int i = 0; i < arreglo.length; i++) {
 System.out.print(arreglo[i] + " ");
 }
 }
}