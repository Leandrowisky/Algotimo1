package lista1;

import java.util.Scanner;

public class Exercicio7 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        double c1, c2, h;
        
        System.out.print("Digite o Primeiro Cateto do Seu Triangulo:");
        c1 = console.nextDouble();
        System.out.print("Digite o Segundo Cateto do Seu Triangulo:");
        c2 = console.nextDouble();
        
        h = Math.sqrt(Math.pow(c1, 2)+Math.pow(c1, 2));
        
        System.out.println("A Hipotenusa do seu Triangulo é igual a "+h);
        
    }
}
