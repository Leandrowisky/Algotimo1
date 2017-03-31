package lista1;

import java.util.Scanner;

public class Exercicio11 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        double numero;
        
        System.out.print("Digite um Número: ");
        numero = console.nextDouble();
        
        if (numero < 0)
            System.out.println("NÚMERO NEGATIVO!");
    }
}
