package proz.enzo.funccao;

import java.util.Scanner;

public class verificacaoNumero {
    public static String PositivoNegativoZero (double num){
     if(num>0){
        return "positivo";

     } else if (num<0) {
        return "negativo";
        
     } else{
        return "zero";
     }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o numero: ");
        double numero = sc.nextInt();
        String resultado = PositivoNegativoZero(numero);
        System.out.println(resultado);
        sc.close();
    }
    
}
