//Faça um algoritmo que calcule a área de um quadrado, sendo que o comprimento do
//lado é informado pelo usuário. A área do quadrado é calculada elevando-se o lado
//ao quadrado.
package exercicios;

import java.util.Scanner;


public class Exercicio6 {
    public static void main(String[] args) {
        float comprimento;
        float area;
        Scanner ler = new Scanner(System.in);
        
        System.out.println("Insira o comprimento de um lado do quadrado: ");
        comprimento = ler.nextFloat();
        area = comprimento*comprimento;
        System.out.println("A área do quadrado é : "+ area);
        
    }
}
