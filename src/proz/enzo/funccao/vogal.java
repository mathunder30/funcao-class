package proz.enzo.funccao;

import java.util.Scanner;

public class vogal {
    public static String VogaisouConsoante(String let){
        if (let.equals("a") || let.equals("e")|| let.equals("i")||let.equals("o")||let.equals("u")) {
            return "vogal";
            
        } else{
            return "consoante";
        }

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite uma letra: ");
        String letra = sc.next();
        String retorno = VogaisouConsoante(letra);
        System.out.println(retorno);
        sc.close();
    }
    
}
