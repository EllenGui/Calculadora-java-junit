package com.calculadora;
import java.util.Scanner;

public class Calculadora {
    
   
    public static void main (String[] args){
        Scanner leia= new Scanner(System.in);
        Double n1,n2;
        String operaçao;

        System.out.println("Bem vindo a Calculadora, onde suas operações serão resolvidas");
        System.out.println("Digite o primeiro número: ");
        n1 = leia.nextDouble();
        System.out.println("Digite o segundo número: ");
        n2 = leia.nextDouble();
        System.out.println("Escolha a operação 'somar, subtrair, multiplicar, dividir, potenciar: '" );
        operaçao = leia.next();
        System.out.println("Resultado da operção escolhida: " + realizarCalculo  (n1, n2, operaçao));
        leia.close();
    }


    public static double realizarCalculo(double n1, double n2, String operaçao){
        double respostaCalculo = 0.0;

        switch(operaçao){
            case "somar":
            respostaCalculo = n1+n2;
            break;
            case "subtrair":
            respostaCalculo = n1-n2;
            break;
            case "multiplicar":
            respostaCalculo = n1*n2;
            break;
            case "dividir":
            respostaCalculo = n1/n2;
            break;
            case "potenciar":
            respostaCalculo = Math.pow(n1,n2);
            break;
            default : 
            System.out.print("Operação inválida");
        }
        return respostaCalculo;
    }
}
