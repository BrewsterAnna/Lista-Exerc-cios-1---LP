//Faça um algoritmo que calcule a área de um retângulo, sendo que os comprimentos
//da altura e da base são informados pelo usuário. A área do retângulo é calculada
//multiplicando-se a altura pela base.
package exercicios;

import java.util.Scanner;

public class Exercicio7 {
    public static void main(String[] args) {
        float base;
        float altura;
        float area;
        Scanner ler = new Scanner (System.in);
        
        System.out.println("Insira o valor da altura: ");
        altura = ler.nextFloat();
        System.out.println("Insira o valor da base: ");
        base = ler.nextFloat();
        area = base*altura;
        System.out.println("A área do retangulo é: "+ area);
    }
}
