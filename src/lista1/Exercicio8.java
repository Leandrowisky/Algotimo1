package lista1;

import java.util.Scanner;

public class Exercicio8 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        double num1, num2, num3, num4, media;
        
        System.out.print("Digite o Primeiro Número Que irá Compor a Média: ");
        num1 = console.nextDouble();
        System.out.print("Digite o Segundo Número Que irá Compor a Média: ");
        num2 = console.nextDouble();
        System.out.print("Digite o Terceiro Número Que irá Compor a Média: ");
        num3 = console.nextDouble();
        System.out.print("Digite o Quarto Número Que irá Compor a Média: ");
        num4 = console.nextDouble();
        
        media = (num1 + num2 + num3 + num4)/4;
        
        System.out.println("A Média dos Números Informados é: "+media);
        
    }
    
}
