//Faça um algoritmo que calcule a área de uma esfera, sendo que o comprimento do
//raio é informado pelo usuário. A área da esfera é calculada multiplicando-se 4 vezes
//Pi ao raio ao quadrado
package exercicios;

import java.util.Scanner;

public class Exercicio9 {
    public static void main(String[] args) {
        float raio;
        float pi = (float) 3.14;
        float area;
        Scanner ler = new Scanner(System.in);
        System.out.println("Insira o valor do raio: ");
        raio  = ler.nextFloat();
        area = (raio*raio)* (pi*4);
        System.out.println("A área da esfera é: "+ area);
    }
    
}
