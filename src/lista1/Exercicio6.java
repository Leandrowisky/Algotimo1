package lista1;

import java.util.Scanner;

/*
6. Escreva um algoritmo que leia três números decimais: A, B e C. Em seguida, calcule e mostre:
a) a área do triângulo retângulo que tem A por base e C por altura.
b) a área do círculo de raio C. (π = 3.14159)
c) a área do trapézio que tem A e B por bases e C por altura.
d) a área do quadrado que tem lado B.
e) a área do retângulo que tem lados A e B.
f) o perímetro do retângulo que tem lados A e B.
*/
public class Exercicio6 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        float A, B, C;
        
        System.out.println("Insira o Valor do Primeiro Número:");
        A = leitor.nextFloat();
        System.out.println("Insira o Valor do Segundo Número:");
        B = leitor.nextFloat();
        System.out.println("Insira o Valor do Terceiro Número:");
        C = leitor.nextFloat();
        
        System.out.println("A- A Área do Triângulo Retângulo é igual a: " + (A*C)/2);
        System.out.println("B- A Área do Circulo é igual a: " + Math.PI*C*C);
        System.out.println("C- A Área do Trapézio é igual a: " + ((A+B)*C)/2);
        System.out.println("D- A Área do Quadrado é igual a: " + B*B);
        System.out.println("E- A Área do Retangulo é igual a: " + A*B);
        System.out.println("F- O Perímetro do Retângulo é igual a: " + (A+B)*2);
        
    }
}
