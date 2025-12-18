/*En nuestro desafío,
1 moneda en Club Penguin equivale a $0.0045 USD.
Crea un programa que funcione como calculadora de conversión, 
donde un pingüino pueda ingresar la cantidad de monedas que tiene y 
te mostrará cuánto dinero tiene en USD. */

import java.util.Scanner;

public class divisas_en_Club_penguin {
     public static void main(String[] args) {
        // Write your code here 💖
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingresa la cantiad de monedas penguin:");
        int monedas = scanner.nextInt();

        double dolares = monedas * 0.0045;

        System.out.println(dolares);
    }
}
