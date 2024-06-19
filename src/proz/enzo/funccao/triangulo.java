package proz.enzo.funccao;

import java.util.Scanner;

public class triangulo {
    public static String LadoTriangulo (int lado1, int lado2, int lado3 ){
        if ((lado1 + lado2) > lado3 || (lado2 + lado3) > lado1 || (lado3 + lado1) > lado2) {
            
        
            if(lado1 == lado2 && lado2 == lado3 && lado3 == lado1){
                return "quando os lados são iguais: equilátero";

            } else if (lado1 == lado2 || lado2 == lado3 || lado1 == lado3) {
                return "quando pelo menos dois lados são iguais: isósceles";
                
            } else if (lado1 != lado2 && lado2 != lado3 && lado3 != lado1){
                return "quando todos os lados são diferentes: escaleno";

            } else{
                return "comando não reconheco";
            }
    } else{
        return"não é um triangulo";
    }

    } 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o primeiro lado:  ");
        int L1 = sc.nextInt();
        System.out.println("Digite o segundo lado: ");
        int L2 = sc.nextInt();
        System.out.println("Digite o terceiro lado: ");
        int L3 = sc.nextInt();
        String resultado = LadoTriangulo(L1, L2, L3);
        System.out.println(resultado);
        sc.close();

    }
    
}
