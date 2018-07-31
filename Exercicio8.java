//Faça um algoritmo que calcule a área de um círculo, sendo que o comprimento do
//raio é informado pelo usuário. A área do círculo é calculada multiplicando-se Pi ao
//raio ao quadrado
package exercicios;

import java.util.Scanner;

public class Exercicio8 {
    public static void main(String[] args) {
        float raio;
        float pi = (float) 3.14;
        float area;
        Scanner ler = new Scanner (System.in);
        
        System.out.println("Insira o raio: ");
        raio = ler.nextFloat();
        area = (raio*raio)*pi;
        System.out.println("A área do circulo é: "+area);
    }
}
