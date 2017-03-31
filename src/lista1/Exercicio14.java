package lista1;

import java.util.Scanner;

public class Exercicio14 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        double num1, num2, maior, menor;
        
        System.out.print("Digite o Primeiro Número: ");
        num1 = console.nextDouble();
        System.out.print("Digite o Segundo Número: ");
        num2 = console.nextDouble();
        
        if (num1 > num2){
            maior = num1;
            menor = num2;
        }else{
            maior = num2;
            menor = num1;
        }
        
        System.out.println("A Divisão do Número Maior Pelo Menor é: "+(maior/menor));
    }
}
