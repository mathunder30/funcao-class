package proz.enzo.funccao;

import java.util.Scanner;

public class App {
    public static String verificacaoIdade (int num){
        if (num >= 18){
            return "tem idade para dirigir!";

        } else{
            return "não pode dirigir";

        }
    

    }
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a sua idade: ");
        int idade = sc.nextInt();
        String resultado = verificacaoIdade(idade);
        System.out.println(resultado);
        sc.close();
    }
}
