package ExDois;

import java.util.Scanner;
import java.util.Set;

public class Conta {

    protected double saldo;

    public Conta() {
        this.saldo = 1000;
    }

    public double getSaldo() {
        return saldo;
    }

    public double decisao(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Seu saldo atual: " + getSaldo() + "\n");
        System.out.println("Você deseja: \n1- Conta Poupança \n2- Conta Corrente \n3- Seguro de Vida");
        switch (scan.nextInt()){
            case 1:
                ContaPP accP = new ContaPP();
                return accP.getSaldo();
            case 2:
                ContaCC accC = new ContaCC();
                return accC.calcularTributo();
            case 3:
                SeguroDeVida seguro = new SeguroDeVida();
                return seguro.calcularTributo();
            default:
                System.out.println("Inválido");
                return 0;
        }
    }


}
