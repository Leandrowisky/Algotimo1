package lista1;

import java.util.Scanner;

/*
4. Fazer um algoritmo que lê dois números inteiros e imprime os números consecutivos desses números.
(Por exemplo: se o usuário digitar 2 e ­9, a saída deverá ser 3 e ­8, porque 3 é consecutivo de 2. –8 é
consecutivo de –9)
*/
public class Exercicio4 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int n1, n2;
        
        System.out.println("Digite o Primeiro Número:");
        n1 = leitor.nextInt();
        System.out.println("Digite o Segundo Número:");
        n2 = leitor.nextInt();
        
        System.out.println("Os Números Consecutivos dos Digitados São " + 
                (n1+1) + " e " + (n2+1) + " Respectivamente." );
    }
}
