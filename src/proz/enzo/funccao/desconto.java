package proz.enzo.funccao;

import java.util.Scanner;

public class desconto {
    public static Object DescontoProduto (double num){
        double porcentagem;
        double valor_porcetagem;
        
        if (num >= 100 && num < 150) {
            porcentagem = 10.0/100;
            valor_porcetagem = num* porcentagem;
            return num - valor_porcetagem;
           } else if (num > 150 && num < 200) {
            porcentagem = 15.0/100;
            valor_porcetagem = num* porcentagem;
            return num - valor_porcetagem;
            
           } else if (num > 200) {
            porcentagem = 20.0/100;
            valor_porcetagem = num * porcentagem;
            return num - valor_porcetagem;
            
           } else{
            return "valor não definido";
           }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o valor do produto: ");
        double valor = sc.nextDouble();
        Object resultado = DescontoProduto(valor);
        if (resultado instanceof Double){
            System.out.println("O valor com desconto é: "+ resultado);
        } else if (resultado instanceof String) {
            System.out.println(resultado);
            
        }

        
        sc.close();
    }
    
}
