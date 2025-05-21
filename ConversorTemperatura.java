/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.conversor.temperatura;

import java.util.Scanner;

/**
 *
 * @author FATEC ZONA LESTE
 */
public class ConversorTemperatura {

    /**
     *
     * @param args
     */
    public static void main(String[] args) {
        System.out.println("Hello World!");
        // Entrada do usuário
        try (Scanner scanner = new Scanner(System.in)) {
            // Entrada do usuário
            System.out.print("Digite a temperatura em graus Celsius: ");
            double celsius = scanner.nextDouble();
            
            // Conversões
            double fahrenheit = (celsius * 9 / 5) + 32;
            double kelvin = celsius + 273.15;
            
            // Saída
            System.out.printf("Temperatura em Fahrenheit: %.2f °F%n", fahrenheit);
            System.out.printf("Temperatura em Kelvin: %.2f K%n", kelvin);
        }
    }
}