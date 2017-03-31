package lista1;

import java.util.Scanner;

public class Exercicio17 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int a, b, c, d;
        
        System.out.println("Digite o Primeiro Número: ");
        a = console.nextInt();
        System.out.println("Digite o Segundo Número: ");
        b = console.nextInt();
        System.out.println("Digite o Terceiro Número: ");
        c = console.nextInt();
        System.out.println("Digite o Quarto Número: ");
        d = console.nextInt();
        
        if (b > c && d > a && (c+d) > (a+b) && c > 0 && d > 0 && a%2 == 0)
            System.out.println("Valores Aceitos!");
        else
            System.out.println("Valores Não Aceitos!");
            
    }
}
