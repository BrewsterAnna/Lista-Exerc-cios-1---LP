//Faça um algoritmo que calcule o novo valor de um salário a partir de um valor
//percentual de reajuste. O valor atual do salário e o valor percentual do reajuste
//devem ser informados pelo usuário como, por exemplo, 7,3%.
package exercicios;

import java.util.Scanner;

public class Exercicio5 {
  
    public static void main(String[] args) {
        float salario;
        float novoSalario;
        double percent;
        Scanner ler = new Scanner (System.in);
        
        System.out.println("Insira seu salário atual R$: ");
        salario = ler.nextFloat();
        System.out.println("Insira o percentual de reajuste %: ");
        percent = ler.nextDouble();
        novoSalario = (float) (salario*percent);
        System.out.println("Seu novo salário é R$: "+ novoSalario);
    }
 
}
