package proz.enzo.funccao;

import java.util.Scanner;

public class classificacaoIDade {

    public static String Idade(int num){
        if (num < 12) {
            return"Você é um bebezizinho de mamae, uma criancinha.";
            
        } else if(num >=13 && num <=17){
            return"Você é muito chato, porque você é um adolescente.";

        } else if (num >= 18 && num <=27){
            return"Você está começando a vida agora! Você é um jovem adulto.";

        } else if (num >27) {
            return"Você é um adulto.";
            
        } else{
            return"idade não encontrada.";
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
        System.out.println("digite a sua idade: ");
        int idade = sc.nextInt();
        if (idade != -1) {
            
        String resultado = Idade(idade);
        System.out.println(resultado);
        } else{
            System.out.println("saindo...");
            break;
        }
    }


        sc.close();
    }

    
}