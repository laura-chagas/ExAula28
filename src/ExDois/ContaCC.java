package ExDois;

public class ContaCC extends Conta implements CalculoTributos{

    @Override
    public double calcularTributo() {
        System.out.println("O valor do tributo é: R$" + (saldo * 0.01));

        System.out.println("Seu saldo ficará:");
        return saldo - (saldo * 0.01);

    }

}
