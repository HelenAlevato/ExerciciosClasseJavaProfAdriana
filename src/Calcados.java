public class Calcados {
    private String[] tenis;
    private String[] social;
    private String[] salto;
    
    public Calcados() {
    }
    
    public Calcados(String[] tenis, String[] social, String[] salto) {
        this.tenis = tenis;
        this.social = social;
        this.salto = salto;
    }
    
    public static void main(String[] args) {
        String[] tiposDeTenis = new String[]{"Corrida", "Minimalista", "Slip-On", "Old Skool"};
        String[] tiposDeSapatoSocial = new String[]{"Oxford", "Derby", "Brogue"};
        String[] tiposDeSalto = new String[]{"Anabela", "Meia Pata", "Bloco"};
        Calcados Fatec = new Calcados(tiposDeTenis, tiposDeSapatoSocial, tiposDeSalto);
        
        System.out.println(Fatec.tenis);
        System.out.println(Fatec.social);
        System.out.println(Fatec.salto);
    }
}