package lista1;

import java.util.Scanner;

public class Velha {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String a, b, c, d,e,f,g,h,i;
        String simbolo;
        int posicao;
        
        System.out.print("Informe o Simbolo da Jogada (X ou O): ");
        simbolo = console.next();
        System.out.print("Informe a posição da jogada(De 1 a 9): ");
        posicao = console.nextInt();
        
        if (posicao == 1){
            a = simbolo;
        }else{
            a = " ";
        }
        if (posicao == 2){
            b = simbolo;
        }else{
            b = " ";
        }
        if (posicao == 3){
            c = simbolo;
        }else{
            c = " ";
        }
        if (posicao == 4){
            d = simbolo;
        }else{
            d = " ";
        }
        if (posicao == 5){
            e = simbolo;
        }else{
            e = " ";
        }
        if (posicao == 6){
            f = simbolo;
        }else{
            f = " ";
        }
        if (posicao == 7){
            g = simbolo;
        }else{
            g = " ";
        }
        if (posicao == 8){
            h = simbolo;
        }else{
            h = " ";
        }
        if (posicao == 9){
            i = simbolo;
        }else{
            i = " ";
        }
        
        System.out.println("       |       |       ");
        System.out.println("   "+a+"   |   "+b+"   |   "+c+"   ");
        System.out.println("_______|_______|_______");
        System.out.println("       |       |       ");
        System.out.println("   "+d+"   |   "+e+"   |   "+f+"   ");
        System.out.println("_______|_______|_______");
        System.out.println("       |       |       ");
        System.out.println("   "+g+"   |   "+h+"   |   "+i+"   ");
        System.out.println("       |       |       ");
        
    }
}
