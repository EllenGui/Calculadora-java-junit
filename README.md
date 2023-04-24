#  Calculadora-java-Junit

Esse é um projeto de uma calculadora simples em Java, na qual permite que o usuário insira dois números e escolha qual operação deseja executando, sendo elas: adição, subtração, multiplicação, divisão e potenciação.
Esse projeto foi desenvolvido para estudo de testes unitários em Java utilizando Junit. Primeiramente foi desenvolvido uma calculadora com as operações citadas acima, após a implementação foi criado um teste unitário para cada operação, para que o funcionamento da calculadora fosse validado. Segue abaixo a explicação do desenvolvimento da mesma, e posteriormente dos testes unitários.

## Ferramentas utilizadas

[Visual Studio Code](https://code.visualstudio.com)  - Um editor de código-fonte desenvolvido pela Microsoft.

[Java](https://www.java.com/pt-BR/)  - Uma linguagem de programação de alto nível e plataforma computacional.

[JUnit](https://junit.org/junit5/)  - Um framework de testes unitários para a linguagem de programação Java.

## Autora
Projeto desenvolvido por [Ellen Guimarães](https://github.com/EllenGui).

## Desenvolvimento

O código começa importando a classe Scanner para permitir que o usuário insira informações via teclado. Em seguida, é definida uma classe chamada "Calculadora".

O método "main" é o ponto de entrada do programa. Ele inicia definindo um objeto "leia" do tipo Scanner. Em seguida, são declaradas as variáveis "n1", "n2" e "operação".

O programa então exibe uma mensagem de boas-vindas e solicita que o usuário insira o primeiro número. O método "nextDouble()" do objeto "leia" é usado para capturar a entrada do usuário e armazenar o valor em "n1". O mesmo processo é repetido para o segundo número e a operação escolhida.

A operação escolhida é armazenada como uma string na variável "operação". Em seguida, a função "realizarCalculo" é chamada, passando as variáveis "n1", "n2" e "operação" como argumentos. O resultado do cálculo é exibido na tela usando a função "println()" do objeto "System.out".

Por fim, o método "close()" é usado para liberar os recursos do objeto "leia".

A função "realizarCalculo" é definida abaixo do método "main". Ele recebe dois números e uma string como argumentos e retorna um valor double. Dentro da função, há um switch/case que determina qual operação deve ser realizada. Dependendo do valor da string "operação", o programa adiciona, subtrai, multiplica, divide ou eleva um número ao outro. Se a string "operação" não corresponder a nenhum dos casos, o programa exibe uma mensagem de erro.

Em resumo, este código implementa uma calculadora básica em Java que permite que o usuário insira dois números e escolha uma operação a ser realizada. O programa usa a classe Scanner para capturar a entrada do usuário e a função "switch/case" para determinar qual operação deve ser realizada.
```
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
```
## Teste Unitário 
Esse teste unitário verifica se o método realizarCalculo() da classe Calculadora está calculando corretamente as operações matemáticas básicas, como soma, subtração, multiplicação, divisão e potenciação.

Cada teste é representado por um método que começa com @Test e contém valores de entrada (n1, n2 e operacao) e um resultado esperado (resultadoEsperado). O método realizarCalculo() é então chamado com os valores de entrada e o resultado é comparado com o resultado esperado usando o método assertEquals().

Se o resultado calculado pela Calculadora for igual ao resultado esperado com uma diferença máxima de 0.01, o teste passa e o método retorna true. Caso contrário, o teste falha e uma mensagem de erro é exibida indicando que o resultado esperado não foi obtido.

O objetivo do teste unitário é verificar se cada método da classe Calculadora está funcionando corretamente e detectar possíveis erros no código antes que ele seja lançado em produção. Dessa forma, é possível garantir que o software está funcionando de acordo com as especificações e minimizar possíveis erros ou falhas no sistema.
```
package com.calculadora;

import org.junit.Test;
import static org.junit.Assert.*;

public class CalculadoraTest {
  
  @Test
  public void testRealizarCalculoSomar() {
    double n1 = 5;
    double n2 = 5;
    String operacao = "somar";
    double resultadoEsperado = 10;
    
    double resultadoCalculado = Calculadora.realizarCalculo(n1, n2, operacao);
    
    assertEquals(resultadoEsperado, resultadoCalculado, 0.01);
  }
  
  @Test
  public void testRealizarCalculoSubtracao() {
    double n1 = 5;
    double n2 = 5;
    String operacao = "subtrair";
    double resultadoEsperado = 0;
    
    double resultadoCalculado = Calculadora.realizarCalculo(n1, n2, operacao);
    
    assertEquals(resultadoEsperado, resultadoCalculado, 0.01);
  }

  @Test
  public void testRealizarCalculoMultiplicacao() {
    double n1 = 5;
    double n2 = 5;
    String operacao = "multiplicar";
    double resultadoEsperado = 25;
    
    double resultadoCalculado = Calculadora.realizarCalculo(n1, n2, operacao);
    
    assertEquals(resultadoEsperado, resultadoCalculado, 0.01);
  }
  @Test
  public void testRealizarCalculoDivisão() {
    double n1 = 5;
    double n2 = 5;
    String operacao = "dividir";
    double resultadoEsperado = 1;
    
    double resultadoCalculado = Calculadora.realizarCalculo(n1, n2, operacao);
    
    assertEquals(resultadoEsperado, resultadoCalculado, 0.01);
  }
  @Test
  public void testRealizarCalculoPotenciação() {
    double n1 = 2;
    double n2 = 2;
    String operacao = "potenciar";
    double resultadoEsperado = 4;
    
    double resultadoCalculado = Calculadora.realizarCalculo(n1, n2, operacao);
    
    assertEquals(resultadoEsperado, resultadoCalculado, 0.01);
  }
}
```

