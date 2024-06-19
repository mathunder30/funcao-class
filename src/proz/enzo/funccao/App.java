package proz.enzo.funccao;

import java.util.Scanner;

public class App {
    public static String VerificacaoIdade (int num){
        if (num > 18){
            return "tem idade para dirigir!";

        } else if(num < 18){
            return "não pode dirigir";

        }

    }
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a sua idade: ");
        int idade = sc.nextInt();
        sc.close();
    }
}
