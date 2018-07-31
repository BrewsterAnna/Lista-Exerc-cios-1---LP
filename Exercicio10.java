//Faça um algoritmo que calcule o volume de uma caixa de água cilíndrica, sendo que
//os comprimentos do raio e a altura são informados pelo usuário. O volume é
//calculado multiplicando-se Pi, ao raio ao quadrado, a altura.
package exercicios;

import java.util.Scanner;

public class Exercicio10 {
    public static void main(String[] args) {
        float raio;
        float altura;
        float pi = (float) 3.14;
        float volume;
        Scanner ler  = new Scanner (System.in);
        
        System.out.println("Insira o valor do raio: ");
        raio = ler.nextFloat();
        System.out.println("Insira o valor da altura: ");
        altura = ler.nextFloat();
        volume = pi*(raio*raio)*altura;
        System.out.println("O volume do cilindro é: "+volume);
    }
}
