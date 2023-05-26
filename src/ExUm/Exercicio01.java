package ExUm;

import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Você deseja: \n1- Lâmpada Incandescente \n2- Lâmpada Fluorescente");
        System.out.println(FabricaLampada.construir(scan.nextInt()));
        System.out.println("---------------------------------");



    }
}
