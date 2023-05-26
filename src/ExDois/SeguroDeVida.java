package ExDois;

public class SeguroDeVida extends Conta implements CalculoTributos {

    @Override
    public double calcularTributo() {
        System.out.println("O valor da taxa fixa é: R$" + 42);

        System.out.println("Seu saldo ficará: ");
        return saldo - 42;

    }
}
