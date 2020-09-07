public class Lugar {
    private String[] pontosTuristicos;
    private String[] comidas;
    private String[] hoteis;
    
    public Lugar() {
    }
    
    public Lugar(String[] pontosTuristicos, String[] comidas, String[] hoteis) {
        this.pontosTuristicos = pontosTuristicos;
        this.comidas = comidas;
        this.hoteis = hoteis;
    }
    
    public static void main(String[] args) {
        String[] pontosTuristicosBahia = new String[]{"Parque Nacional", "Elevador Lacerda", "Mercado Modelo"};
        String[] comidasTipicas = new String[]{"Tapioca", "Vatapá", "Acarajé"};
        String[] nomeDeHoteis = new String[]{"Fiesta Bahia", "Gran Hotel", "Porto Seguro Eco Bahia Hotel"};
        Lugar Bahia = new Lugar(pontosTuristicosBahia, comidasTipicas, nomeDeHoteis);
        
        
        System.out.println(Bahia.pontosTuristicos);
        System.out.println(Bahia.comidas);
        System.out.println(Bahia.hoteis);
    }
}