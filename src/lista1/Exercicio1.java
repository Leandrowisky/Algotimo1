package lista1;

import java.util.Scanner;

/*
1. Fazer um algoritmo que leia dois números e imprima na tela o produto (multiplicação) dos dois
números.
*/
public class Exercicio1 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        float n1, n2, resultado;
        
        System.out.println("Digite o primeiro número:");
        n1 = leitor.nextFloat();
        System.out.println("Digite o segundo número:");
        n2 = leitor.nextFloat();
        
        resultado = n1*n2;
        System.out.println("Resultado da Multiplicação: " + resultado);
    }
}
