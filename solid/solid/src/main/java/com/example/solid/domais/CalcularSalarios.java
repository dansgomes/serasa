package com.example.solid.domais;

public class CalcularSalarios {

  private Double salario;

  public void salarioComdescontos(String modalidade, Double salario) {

    switch (modalidade) {

      case "CLT":
        this.salario = salario - ((salario * 8 / 100) + (salario * 6 / 100));
        System.out.println("Valor a receber: " + this.salario);
        break;
      case "PJ":
        this.salario = (salario * 168);
        System.out.println("Valor a receber: " + this.salario);
        break;
      case "estagio":
        this.salario = salario;
        System.out.println("Valor a receber: " + this.salario);
        break;
      default:
        System.out.println("Não existe essa modalidade!");

    }
  }

}
