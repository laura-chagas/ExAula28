package ExUm;

public class FabricaLampada {

    public static String construir(int decisao){
        switch (decisao){
            case 1:
                Incandescente lamp = new Incandescente();
                return "Lâmpada Incandescente Criada" + "\n" + lamp.ligar() + "\n" + lamp.desligar();
            case 2:
                Fluorescente lamp2 = new Fluorescente();
                return "Lâmpada Fluorescente Criada"+ "\n" + lamp2.ligar() + "\n" + lamp2.desligar();
            default:
                return "Não foi possível gerar uma Lâmpada";
        }

    }
}
