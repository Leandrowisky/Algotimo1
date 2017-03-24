package lista1;

import java.util.Scanner;

/*
2. Fazer um algoritmo que lê dois números, a base e o expoente, e imprime a potência (base elevada ao
expoente). Dica: use a função matemática Math.pow(). Exemplo: 5 elevado ao cubo ficaria
Math.pow(5, 3) . Você pode trocar esses números por variáveis.
*/
public class Exercicio2 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        float base, resultado;
        int expoente;
        
        System.out.println("Insira o Número da Base:");
        base = leitor.nextFloat();
        System.out.println("Insira o Número do Expoente:");
        expoente = leitor.nextInt();
        
        resultado = (float) Math.pow(base, expoente);
        System.out.println("Resultado da Potenciação: " + resultado);
    }
  
}
