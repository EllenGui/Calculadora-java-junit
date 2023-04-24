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
