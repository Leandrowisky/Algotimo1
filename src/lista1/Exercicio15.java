package lista1;

import java.util.Scanner;

public class Exercicio15 {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        double a, b, c, delta, x1, x2;
        System.out.print("Digite o Valor do Coeficiente A: ");
        a = console.nextDouble();
        System.out.print("Digite o Valor do Coeficiente B: ");
        b = console.nextDouble();
        System.out.print("Digite o Valor do Coeficiente C: ");
        c = console.nextDouble();

        if (a == 0) {
            System.out.println("Impossível Calcular");
        } else {
            delta = (Math.pow(b, 2)) - 4 * a * c;
            System.out.println(delta);
            if (delta < 0) {
                System.out.println("Delta Negativo! Não Existe Raiz Real!");
            } else {
                x1 = (-b + Math.sqrt(delta)) / (2 * a);
                x2 = (-b - Math.sqrt(delta)) / (2 * a);
                if (delta == 0) {
                    System.out.println("Delta Igual a Zero! As raizes X' e X'' é igual a: " + x1);
                } else {
                    System.out.println("Delta Maior que Zero! A raiz X' é igual a " + x1 + " e X'' igual a " + x2);
                }
            }
        }

    }
}
