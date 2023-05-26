package ExUm;

public class Fluorescente implements Lampada{

    @Override
    public String ligar() {
        return "Lâmpada Ligada! ";
    }

    @Override
    public String desligar() {
        return "Lâmpada Desligada";
    }
}
