//Faça um algoritmo para calcular a média de duas notas digitadas pelo usuário.

package exercicios;

import java.util.Scanner;

public class Exercicio2 {
    
    public static void main(String[] args) {
        int nota1;
        int nota2;
        float media;
        Scanner ler = new Scanner (System.in);
        
        System.out.println("Entre com a nota 1: ");
        nota1 = ler.nextInt();
        System.out.println("Entre com a nota 2: ");
        nota2 = ler.nextInt();
        media = (float)(nota1+nota2)/2;
        System.out.println("Sua média é: "+ media);
        
    }
}
