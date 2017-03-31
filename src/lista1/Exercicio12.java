package lista1;

import java.util.Scanner;

public class Exercicio12 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        double l, r, areaQuadrado, areaCirculo;
        
        System.out.print("Digite o Valor de Lado L do Quadrado: ");
        l = console.nextDouble();
        System.out.print("Digite o Valor de Raio R do Circulo: ");
        r = console.nextDouble();
        
        areaQuadrado = l*l;
        areaCirculo = Math.PI*Math.pow(r, 2);
        
        if (areaQuadrado > areaCirculo)
            System.out.println("A Área do Quadrado é Maior");
        else
            System.out.println("A Area do Circulo é Maior");
    }
}
