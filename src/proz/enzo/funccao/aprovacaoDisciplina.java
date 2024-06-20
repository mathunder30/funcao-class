package proz.enzo.funccao;

import java.util.Scanner;

public class aprovacaoDisciplina {
    public static String Aprovacao(double num){
        if (num >= 7) {
            return "Você está aprovado! Meus parabens!";
            
        } else if (num < 6) {
            return "infelizmente você está reprovado :(";
            
        } else{
            return "nota não identificada.";
        }

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("digite a sua nota: ");
        double nota = sc.nextDouble();
        String resposta = Aprovacao(nota);
        System.out.println(resposta);
        sc.close();
    }
    
}
