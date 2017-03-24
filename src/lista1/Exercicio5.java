package lista1;

import java.util.Scanner;

/*
5. Fazer um algoritmo que leia um valor L e calcula a área de um quadrado de lado L.
*/
public class Exercicio5 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        float lado;

        System.out.println("Digite o valor do lado L do Quadrado:");
        lado = leitor.nextFloat();
        System.out.println("A Área do Quadrado é Igual a " + lado*lado);
    }
    
}
