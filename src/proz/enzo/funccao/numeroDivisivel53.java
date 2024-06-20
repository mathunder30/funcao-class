package proz.enzo.funccao;

import java.util.Scanner;

public class numeroDivisivel53 {

    public static String Divisivelpor3ou5(int num){
            if (num % 3 == 0) {
                return "esse numero é divisivel por 3";
                
            } else if (num % 5 == 0) {
                return "Esse numero é divisivel por 5";
                
            } else if (num == 15 || num == 30) {
                return "esse numero é divisivel tanto por 5 quanto por 3";
                
            }
            else{
                return"Esse numero não é divisivel por 5 e nem por 3";
            }

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um numero para saber se ele é divisivel por 3 ou 5");
        int numero = sc.nextInt();
        String retorno = Divisivelpor3ou5(numero);
        System.out.println(retorno);
        sc.close();
    }
    
}
