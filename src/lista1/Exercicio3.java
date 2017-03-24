package lista1;

import java.util.Scanner;

/*
3. Fazer um algoritmo que lê dois números e imprime a soma dos quadrados dos dois números. O
quadrado de um número A é representado por A^2 = A * A
*/
public class Exercicio3 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        float n1, n2, resultado;
        
        System.out.println("Digite o Primeiro Número:");
        n1 = leitor.nextFloat();
        System.out.println("Digite o Segundo Número:");
        n2 = leitor.nextFloat();
        
        resultado = (float)(Math.pow(n1, 2) + Math.pow(n2, 2));
        System.out.println("Resultado da Soma dos Quadrados dos Dois Números: " + resultado);
    }
}
