package lista1;

import java.util.Scanner;

public class Exercicio13 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        double num1, num2, num3, numMaior;
        
        System.out.print("Digite o Primeiro Número: ");
        num1 = console.nextDouble();
        System.out.print("Digite o Segundo Número: ");
        num2 = console.nextDouble();
        System.out.print("Digite o Terceiro Número: ");
        num3 = console.nextDouble();
        
        if (num1 > num2 && num1 > num3)
            numMaior = num1;
        else if (num2 > num1 && num2 > num3)
            numMaior = num2;
        else
            numMaior = num3;
        
        System.out.println("O Número Maior é: "+numMaior);
    }
}
