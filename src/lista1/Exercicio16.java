package lista1;

import java.util.Scanner;

public class Exercicio16 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int horaInicial, horaFinal, tempoJogo;
        
        System.out.print("Digime a hora de jogo inicial: ");
        horaInicial = Integer.parseInt(console.next());
        System.out.print("Digime a hora de jogo Final: ");
        horaFinal = Integer.parseInt(console.next());
        
        if (horaInicial > horaFinal){
            horaInicial = 24 - horaInicial;
            tempoJogo = horaInicial + horaFinal;
        }else if (horaInicial == horaFinal)
            tempoJogo = 24;
        else
            tempoJogo = horaFinal - horaInicial;
        
        System.out.println("O Seu Tempo de Jogo Total é: "+ tempoJogo +  " Hora(s)");
        
            
    }
}
