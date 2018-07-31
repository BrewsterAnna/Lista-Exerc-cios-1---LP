//Faça um algoritmo que calcule a gorjeta a ser paga de uma conta de restaurante. A
//gorjeta é calculada como sendo 10% do valor da conta, que deve ser informado pelo
//usuário
package exercicios;

import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        final double garçom = 0.10;
        float vConta;
        float valorFinal;
        Scanner ler = new Scanner(System.in);
        
        System.out.println("Insira o valor da conta R$: ");
        vConta = ler.nextFloat();
        valorFinal = (float) (vConta * garçom)+ vConta;
        System.out.println("Valor da conta com os 10% R$: "+valorFinal);
    }
}
