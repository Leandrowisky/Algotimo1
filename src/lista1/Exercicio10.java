package lista1;

import java.util.Scanner;

public class Exercicio10 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String nome;
        double salarioFixo, totalVendas, PERCCOMISSAO, salarioTotal;
        
        PERCCOMISSAO = 0.15;
        
        System.out.print("Digite o Nome do Funcionário: ");
        nome = console.nextLine();
        System.out.print("Digite o Salário Fixo do Funcionário: ");
        salarioFixo = console.nextDouble();
        System.out.print("Digite o Total de Vendas do Funcionário: ");
        totalVendas = console.nextDouble();
        
        salarioTotal = salarioFixo + (totalVendas * PERCCOMISSAO);
        
        System.out.println("O Funcionário "+nome+" Irá receber um total de R$ "+salarioTotal);
    }
}
