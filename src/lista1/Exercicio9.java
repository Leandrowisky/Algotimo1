package lista1;

import java.util.Scanner;

public class Exercicio9 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int registro;
        double horasTrab, taxaHora, salario;
        
        System.out.print("Digite o Número de Cadastro do Funcionário: ");
        registro = console.nextInt();
        System.out.print("Digite o Número de Horas Trabalhadas: ");
        horasTrab = console.nextDouble();
        System.out.print("Digite a Taxa Hora do Funcionário: ");
        taxaHora = console.nextDouble();
        
        salario = horasTrab * taxaHora;
        
        System.out.println("O Funcionário Com Número de Cadastro "+registro+" Receberá R$ "+salario);
    }
}
